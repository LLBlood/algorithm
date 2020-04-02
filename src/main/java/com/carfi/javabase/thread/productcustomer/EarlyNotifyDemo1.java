package com.carfi.javabase.thread.productcustomer;

/**
 * com.carfi.javabase.thread.productcustomer$
 * 早期生产者消费者(没有做到先睡眠再唤醒/没有对应的睡眠标识)
 * @author ll
 * @date 2020-04-02 09:06:44
 **/
public class EarlyNotifyDemo1 {
    private static String lockObject = "";

    public static void main(String[] args) {
        NotifyThread notifyThread = new NotifyThread(lockObject);
        WaitThread waitThread = new WaitThread(lockObject);
        notifyThread.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitThread.start();
    }

    static class WaitThread extends Thread {
        private String lock;

        public WaitThread(String lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            synchronized (lock) {
                try {
                    System.out.println(Thread.currentThread().getName()+" 进去代码块");
                    System.out.println(Thread.currentThread().getName()+" 开始wait");
                    lock.wait();
                    System.out.println(Thread.currentThread().getName()+" 结束wait");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class NotifyThread extends Thread {
        private String lock;

        public NotifyThread(String lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName()+" 进去代码块");
                System.out.println(Thread.currentThread().getName()+" 开始notify");
                lock.notify();
                System.out.println(Thread.currentThread().getName()+" 结束notify");
            }
        }
    }
}
