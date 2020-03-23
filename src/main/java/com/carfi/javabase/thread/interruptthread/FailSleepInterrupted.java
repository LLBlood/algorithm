package com.carfi.javabase.thread.interruptthread;

/**
 * com.carfi.javabase.thread.interruptthread$
 *
 * @author ll
 * @date 2020-03-23 09:21:33
 **/
public class FailSleepInterrupted {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    Thread.yield();
                    System.out.println("运行中--->");

                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("是否还存在中断标记" + Thread.currentThread().isInterrupted());
                        System.out.println(Thread.currentThread().getName()+"中断成功");
                        return;
                    }

                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        System.out.println("java技术栈线程休眠被中断，程序退出");
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();
        Thread.sleep(2000); //等待线程运行到睡眠阶段，此时打断线程，会中断sleep，并且sleep会清除中断标记
        thread.interrupt();
    }
}
