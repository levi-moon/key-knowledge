package com.levi.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 */
public class ThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService1 = Executors.newFixedThreadPool(1);
        ExecutorService executorService2 = Executors.newFixedThreadPool(1,null);
        ExecutorService executorService3 = Executors.newSingleThreadExecutor();
        ExecutorService executorService4 = Executors.newSingleThreadExecutor(null);
        ExecutorService executorService5 = Executors.newSingleThreadScheduledExecutor();
        ExecutorService executorService6 = Executors.newSingleThreadScheduledExecutor(null);
        ExecutorService executorService7 = Executors.newCachedThreadPool();
        ExecutorService executorService8 = Executors.newCachedThreadPool(null);
        ExecutorService executorService9 = Executors.newScheduledThreadPool(1);
        ExecutorService executorService10 = Executors.newScheduledThreadPool(1,null);
        ExecutorService executorService11 = Executors.newWorkStealingPool();
        ExecutorService executorService12 = Executors.newWorkStealingPool(1);

    }
}
