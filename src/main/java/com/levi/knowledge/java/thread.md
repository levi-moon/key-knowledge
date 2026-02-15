
## 一、四种核心类型
1. newFixedThreadPool
    - newFixedThreadPool(int nThreads)
    - newFixedThreadPool(int nThreads,ThreadFactory threadFactory)
2. newCachedThreadPool
    - newCachedThreadPool()
    - newCachedThreadPool(ThreadFactory threadFactory)
3. newSingleThreadExecutor
    - newSingleThreadExecutor()
    - newSingleThreadExecutor(ThreadFactory threadFactory)
4. newScheduledThreadPool
    - newScheduledThreadPool(int corePoolSize)
    - newScheduledThreadPool(int corePoolSize,ThreadFactory threadFactory)

## 二、两种扩展类型  
1. newSingleThreadScheduledExecutor()
   - newSingleThreadScheduledExecutor(ThreadFactory threadFactory)
2. newWorkStealingPool()
   - newWorkStealingPool(int parallelism)

----



