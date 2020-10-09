package com.carfi.javabase.thread;

import java.util.concurrent.CountDownLatch;

/**
 * com.carfi.javabase.thread$
 *
 * @author ll
 * @date 2020-10-09 11:09:09
 **/
public class CountDownLatchThread {
    public static void main(String[] args) {
        int threadNumber = 2;
        final CountDownLatch cdl = new CountDownLatch(threadNumber);//参数为线程个数
        long start = System.currentTimeMillis();
        System.out.println("start = " + start);
        for (int i = 0; i < threadNumber; i++) {
            //线程启动后调用countDownLatch方法
            new Thread(() -> {
                int num = 1000;
                String s = "";
                for (int j = 0; j < num; j++) {
                    s += "Java";
                }
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t Over" + s);
                cdl.countDown();//此方法是CountDownLatch的线程数-1
            }).start();
        }
        try {
            cdl.await();//需要捕获异常，当其中线程数为0时这里才会继续运行
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("end = " + end);
        System.out.println("end - start = " + (end - start));
    }
}
