package com.carfi.javabase.thread;

/**
 * com.carfi.javabase.thread$
 *
 * @author ll
 * @date 2020-03-20 17:57:08
 **/
public class DeadThread {
    private static Object resource1 = new Object();
    private static Object resource2 = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName()+"拿到了资源1，需要资源2");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("等待资源2到来");
                synchronized (resource2) {
                    System.out.println(Thread.currentThread().getName()+"拿到了资源2");
                }
            }
        }, "线程1").start();

        new Thread(() -> {
            synchronized (resource2) {
                System.out.println(Thread.currentThread().getName()+"拿到了资源2，需要资源1");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("等待资源1到来");
                synchronized (resource1) {
                    System.out.println(Thread.currentThread().getName()+"拿到了资源1");
                }
            }
        }, "线程2").start();
    }
}
