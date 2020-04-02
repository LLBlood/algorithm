package com.carfi.javabase.thread.productcustomer;

/**
 * com.carfi.javabase.thread.productcustomer$
 * 在使用线程的等待/通知机制时，一般都要配合一个 boolean 变量值（或者其他能够判断真假的条件），在 notify 之前改变该 boolean 变量的值，
 * 让 wait 返回后能够退出 while 循环（一般都要在 wait 方法外围加一层 while 循环，以防止早期通知），或在通知被遗漏后，不会被阻塞在 wait 方法处。
 * 这样便保证了程序的正确性
 **/
public class EarlyNotifyDemo2 {
    private static String lockObject = "";
    //睡眠标识
    private static Boolean isFlag = true;

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
                    while (isFlag) {
                        System.out.println(Thread.currentThread().getName()+" 进去代码块");
                        System.out.println(Thread.currentThread().getName()+" 开始wait");
                        lock.wait();
                        System.out.println(Thread.currentThread().getName()+" 结束wait");
                    }
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
                lock.notifyAll();
                isFlag = false;
                System.out.println(Thread.currentThread().getName()+" 结束notify");
            }
        }
    }
}
