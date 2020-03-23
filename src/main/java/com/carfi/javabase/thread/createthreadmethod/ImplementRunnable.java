package com.carfi.javabase.thread.createthreadmethod;

/**
 * com.carfi.javabase.thread.createthreadmethod$
 *
 * @author ll
 * @date 2020-03-23 10:02:06
 **/
public class ImplementRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("垃圾垃圾");
    }

    public static void main(String[] args) {
        new Thread(new ImplementRunnable()).start();
    }
}
