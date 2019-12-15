package com.huangc.base.studyservice.modules.thread;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @Author: huangl
 * @Date: 2019/12/4 17:45
 * @Description: 线程池作用就是限制系统中执行线程的数量。
 * Java通过Executors提供四种线程池，分别为：
 * newCachedThreadPool创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
 * newFixedThreadPool 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
 * newScheduledThreadPool 创建一个定长线程池，支持定时及周期性任务执行。
 * newSingleThreadExecutor 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。
 *
 * 相比new Thread，Java提供的四种线程池的好处在于：
 * a. 重用存在的线程，减少对象创建、消亡的开销，性能佳。
 * b. 可有效控制最大并发线程数，提高系统资源的使用率，同时避免过多资源竞争，避免堵塞。
 * c. 提供定时执行、定期执行、单线程、并发数控制等功能。
 */
public class ThreadTest {
    public static void main(String[] args) {
        /**
         * 创建一个可重用固定线程数的线程池
         * ExecutorService pool = Executors.newFixedThreadPool(2);
         */
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("thread-call-runner-%d").build();
        int size = 2;
        ExecutorService pool = new ThreadPoolExecutor(size,size,0L, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<>(),namedThreadFactory);
        // 创建线程
       for(int i =0;i<5;i++){
           pool.execute(()->System.out.println(Thread.currentThread().getName() + "正在执行。。。"));
       }
        // 关闭线程池
        System.out.println("=============================================================");
        pool.shutdown();
        /**
         * 创建一个定长线程池，支持定时及周期性任务执行。
         */
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        //表示延迟3秒执行。
        scheduledThreadPool.schedule(()-> System.out.println("delay 3 seconds"),3,TimeUnit.SECONDS);
        //表示延迟1秒后每3秒执行一次。
        scheduledThreadPool.scheduleAtFixedRate(()-> System.out.println("delay 1 seconds, and excute every 3 seconds"),1,3,TimeUnit.SECONDS);

        /**
         * 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。
         */
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            final int index = i;
            singleThreadExecutor.execute(()-> System.out.println(index));
        }
        System.out.println("=============================================================");

        /**
         * 可变尺寸的线程池，newCachedThreadPool
         * 可根据需要创建新线程的线程池，但是在以前构造的线程可用时将重用它们。
         */
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for(int i =0;i<10;i++){
            cachedThreadPool.execute(()->System.out.println(Thread.currentThread().getName() + "执行。。。"));
        }
    }

}
