package com.carfi.javabase.thread.daemonthread;

/**
 * com.carfi.javabase.thread.daemonthread$
 * 守护线程
 * @author ll
 * @date 2020-03-23 09:44:53
 **/
public class DaemonThread {
    public static void main(String[] args) {
        Thread daemonThread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        System.out.println("i am alive");
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        System.out.println("finally block");
                    }
                }
            }
        };

        daemonThread.setDaemon(true);
        daemonThread.start();

        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
