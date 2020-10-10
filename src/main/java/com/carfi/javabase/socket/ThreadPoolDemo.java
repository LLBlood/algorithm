package com.carfi.javabase.socket;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * com.carfi.javabase.socket$
 *
 * @author ll
 * @date 2020-10-10 13:16:06
 **/
public class ThreadPoolDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,10,10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5));
        for (int i = 0; i < 20; i++) {
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("渣渣");
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
