package com.carfi.javabase.thread.productcustomer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * com.carfi.javabase.thread.productcustomer$
 *
 * @author ll
 * @date 2020-04-02 09:34:15
 **/
public class ProductorCustomerDemo2 {

    private static ReentrantLock lock = new ReentrantLock();
    private static Condition full = lock.newCondition();
    private static Condition empty = lock.newCondition();

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        ThreadPoolExecutor pool = new ThreadPoolExecutor(15, 15, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(15));
        for (int i = 0; i < 5; i++) {
            pool.execute(new Productor(list, 8, lock));
        }
        for (int i = 0; i < 10; i++) {
            pool.execute(new Customer(list, lock));
        }
    }

    static class Productor implements Runnable {

        private List<Integer> list;
        private int maxLength;
        private Lock lock;

        public Productor(List<Integer> list, int maxLength, Lock lock) {
            this.list = list;
            this.maxLength = maxLength;
            this.lock = lock;
        }

        @Override
        public void run() {
            while (true) {
                lock.lock();
                try {
                    while (list.size() == maxLength) {
                        System.out.println("生产者: " + Thread.currentThread().getName() + " list已经达到最大容量，进行wait");
                        full.await();
                        System.out.println("生产者: " + Thread.currentThread().getName() + " 退出wait");
                    }
                    Random random = new Random();
                    int i = random.nextInt();
                    System.out.println("生产者: " + Thread.currentThread().getName() + " 生产数据" + i);
                    list.add(i);
                    empty.signalAll();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }

    static class Customer implements Runnable {

        private List<Integer> list;
        private Lock lock;

        public Customer(List<Integer> list, Lock lock) {
            this.list = list;
            this.lock = lock;
        }

        @Override
        public void run() {
            while (true) {
                lock.lock();
                try {
                    while (list.isEmpty()) {
                        System.out.println("消费者: " + Thread.currentThread().getName() + " list已经为空，进行wait");
                        empty.await();
                        System.out.println("消费者: " + Thread.currentThread().getName() + " 退出wait");
                    }
                    Integer remove = list.remove(0);
                    System.out.println("消费者" + Thread.currentThread().getName() + "  消费数据：" + remove);
                    full.signalAll();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}
