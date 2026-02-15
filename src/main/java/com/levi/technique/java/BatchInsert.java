package com.levi.technique.java;

import com.google.common.collect.Lists;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * 大数据量通过多线程批量插入
 *
 * 通过多线程、事务管理的方式，将大数据量批量插入到数据库中。
 * 将大数据量的数据集合拆分给多个线程，每个线程执行批量插入操作，并记录事务状态。
 * 如果每个线程执行时没有报错，则同一提交事务；如果有错误，则全部回滚。
 * 这样可以保证这批大数据量的数据可以同时插入提交，防止只成功插入部分数据的情况出现。
 *
 * @author Levi
 * @since 2024/6/6 9:45:11
 */
@Service
public class BatchInsert {

    @Autowired
    private PlatformTransactionManager transactionManager; // 事务管理器

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void performConcurrentImport(List<Map<String, Object>> entityList) throws InterruptedException {
        int threadCount = 3;
        if (entityList.size() < 1000) {
            threadCount = 1;
        } else if (entityList.size() < 5000) {
            threadCount = 2;
        }
        // 开始时间
        long startTime = System.currentTimeMillis();
        // 创建多线程处理任务
        ExecutorService threadPool = Executors.newFixedThreadPool(threadCount);
        // 用于记录所有线程是否成功
        AtomicBoolean allsuccessfull = new AtomicBoolean(true);
        // 获取当前服务的实例
        BatchInsert batchInsert = SpringContextUtil.getApplicationContext().getBean(BatchInsert.class);
        // 创建事务状态集合
        List<TransactionStatus> transactionStatuses = Collections.synchronizedList(new ArrayList<TransactionStatus>());
        // 每块数据表的条数
        int par = entityList.size() / threadCount;
        if (entityList.size() % threadCount != 0) {
            par += 1;
        }
        try {
            // 创建多线程任务集合
            List<FutureTask<TransactionStatus>> tasks = Lists.newArrayList();
            // 拆分数据表为多个分表
            List<List<Map<String, Object>>> subList = Lists.partition(entityList, par);
            // 循环创建多个线程，每个线程插入一块数据表，并将线程任务存到多线程任务集合中
            for (int i = 0; i < threadCount; i++) {
                List<Map<String, Object>> insertList = subList.get(i);
                FutureTask<TransactionStatus> importTask = new FutureTask<>(() -> batchInsert.importTransaction(transactionManager, insertList));
                tasks.add(importTask);
            }
            // 循环提交线程
            for (FutureTask<TransactionStatus> futureTask : tasks) {
                threadPool.submit(futureTask);
            }
            // 循环获取各个线程的事务状态，并存储到事务状态集合中，若某个线程有报错，则设置线程失败
            try {
                for (FutureTask<TransactionStatus> futureTask : tasks) {
                    transactionStatuses.add(futureTask.get());
                }
            } catch (Exception e) {
                e.printStackTrace();
                // 设置线程失败
                allsuccessfull.set(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            allsuccessfull.set(false);
        }

        if (!transactionStatuses.isEmpty()) {
            if (allsuccessfull.get()) {
                //全部执行成功，提交事物
                transactionStatuses.forEach(s -> transactionManager.commit(s));
            } else {
                // 只要有一个线程执行失败，就回滚事物
                transactionStatuses.forEach(s -> transactionManager.rollback(s));
            }
        }
        System.out.println("start time: =====>" + startTime);
        System.out.println("待插入数据被分成了：" + threadCount + "块，每块的大小为：" + par);
        System.out.println("主线程完成");
        // 结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("end time: =====>" + endTime);
        long time = endTime - startTime;
        System.out.println("cost time: =====>" + time);
    }

    /**
     * 使用这种方式将事务状态都放在同一个事务里面
     *
     * @param transactionManager
     * @param entityList
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public TransactionStatus importTransaction(PlatformTransactionManager transactionManager, List<Map<String, Object>> entityList) {
        // 事务定义接口：事务的一些基础信息，如超时时间、隔离级别、传播属性等
        DefaultTransactionDefinition definition = new DefaultTransactionDefinition();
        // 事物传播属性，开启新事务，这样会比较安全些。
        definition.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
        // 获得事务状态，事务的一些状态信息，如是否是一个新的事务、是否已被标记为回滚
        TransactionStatus status = transactionManager.getTransaction(definition);
        // insert方法
        // batchInsert(entityList);
        System.out.println("线程名称：" + Thread.currentThread().getName());
        return status;
    }


    /**
     * 获取spring上下文
     */
    @Component
    static
    class SpringContextUtil implements ApplicationContextAware {
        private static ApplicationContext applicationContext;

        @Override
        public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
            SpringContextUtil.applicationContext = applicationContext;
        }

        public static ApplicationContext getApplicationContext() {
            return applicationContext;
        }
    }
}
