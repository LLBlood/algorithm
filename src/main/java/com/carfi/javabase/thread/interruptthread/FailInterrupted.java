package com.carfi.javabase.thread.interruptthread;

/**
 * com.carfi.javabase.thread.interruptthread$
 * 失败的中断事例
 *  原因：仅仅使用了interrupt，而未使用isInterrupted进行标识
 * @author ll
 * @date 2020-03-23 09:13:09
 **/
public class FailInterrupted {
    public static void main(String[] args) {
       Thread thread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    Thread.yield();
                    System.out.println("运行中--->");
                }
            }
        };
        thread.start();
        thread.interrupt();
    }
}
