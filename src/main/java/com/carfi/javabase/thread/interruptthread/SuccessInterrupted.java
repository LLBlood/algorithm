package com.carfi.javabase.thread.interruptthread;

/**
 * com.carfi.javabase.thread.interruptthread$
 * 加上了中断标记isInterrupted() 获取调用对象是否存在中断标记， 不会清除中断标记
 * 加上了中断标记interrupted() 获取当前线程是否存在中断标记， 会清除中断标记
 * @author ll
 * @date 2020-03-23 09:16:05
 **/
public class SuccessInterrupted {
    public static void main(String[] args) {
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

                    if (Thread.interrupted()) {
                        System.out.println("是否还存在中断标记" + Thread.currentThread().isInterrupted());
                        System.out.println(Thread.currentThread().getName()+"中断成功");
                        return;
                    }
                }
            }
        };
        thread.start();
        thread.interrupt();
    }
}
