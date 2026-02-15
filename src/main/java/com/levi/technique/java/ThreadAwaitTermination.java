package com.levi.technique.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

/**
 * @ClassName: ThreadAwaitTermination。
 * @Description: 多线程超时终止。
 * @Author: Levi。
 * @Date: 2025/6/18 8:59。
 */
public class ThreadAwaitTermination {

    /**
     * 创建list数据集合
     *
     * @return
     */
    public List<Map<String, Object>> createList() {
        List<Map<String, Object>> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Map<String, Object> map = new HashMap<>();
            int j = i + 1;
            map.put("key1", "value" + String.valueOf(j * 1));
            map.put("key2", "value" + String.valueOf(j * 10));
            map.put("key3", "value" + String.valueOf(j * 100));
            map.put("key4", "value" + String.valueOf(j * 1000));
            list.add(map);
        }
        return list;
    }

    public void createThread(List<Map<String, Object>> list) {
        // cpu核心数
        int cpuCoreNum = Runtime.getRuntime().availableProcessors();
        // 创建线程池（固定线程池，以cpu核心数为线程数）
        ExecutorService executorService = Executors.newFixedThreadPool(cpuCoreNum);
        // 保存所有已提交线程任务的结果或异常
        List<Future<?>> futures = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            final Map<String, Object> map = list.get(i);
            // 提交线程，获取线程结果或异常
            Future<?> future = executorService.submit(() -> {
                try {
                    Thread.sleep(3000);
                    map.entrySet()
                            .stream()
                            .forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            // 将各个线程的结果或异常保存到结果集合中
            futures.add(future);
        }
        // 遍历线程结果，设置超时时间
        for (Future<?> future : futures) {
            try {
                // 设置超时时间为2秒
                future.get(2, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                System.out.println("任务超时，正在中断……");
                // 任务超时，中断任务
                future.cancel(true);
            }
        }
        // 关闭线程池
        executorService.shutdown();
        try {
            // 设置等待时间确保所有任务完成或超时，若在超时时间内未完成，则尝试立即关闭线程池及停止所有正在执行的任务
            if (!executorService.awaitTermination(1, TimeUnit.MINUTES)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
    }

    public static void main(String[] args) {
        ThreadAwaitTermination threadAwaitTermination = new ThreadAwaitTermination();
        threadAwaitTermination.createThread(threadAwaitTermination.createList());
    }
}
