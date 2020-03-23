package com.carfi.javabase.thread.createthreadmethod;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * com.carfi.javabase.thread.createthreadmethod$
 * 单例线程池和多例线程池
 * @author ll
 * @date 2020-03-23 10:08:48
 **/
public class ExecutorThread implements Runnable {

    private int count = 1;

    @Override
    public void run() {
        while (true) {
            count++;
            System.out.println(Thread.currentThread().getName()+"线程池创建线程中");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程池创建线程中"+count);
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService1 = Executors.newFixedThreadPool(2);
        ExecutorThread executorThread = new ExecutorThread();
        for (int i = 0; i < 5; i++) {
//            executorService.execute(executorThread);
            executorService1.execute(executorThread);
        }
        System.out.println("线程任务执行中");
        executorService.shutdown();
    }
}
