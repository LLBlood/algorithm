package com.carfi.javabase.thread.productcustomer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * com.carfi.javabase.thread.productcustomer$
 *
 * @author ll
 * @date 2020-04-02 09:34:15
 **/
public class ProductorCustomerDemo3 {

    private static LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        ThreadPoolExecutor pool = new ThreadPoolExecutor(15, 15, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(15));
        for (int i = 0; i < 5; i++) {
            pool.execute(new Productor(queue));
        }
        for (int i = 0; i < 10; i++) {
            pool.execute(new Customer(queue));
        }
    }

    static class Productor implements Runnable {

        private LinkedBlockingQueue<Integer> queue;

        public Productor(LinkedBlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Random random = new Random();
                    int i = random.nextInt();
                    System.out.println("生产者: " + Thread.currentThread().getName() + " 生产数据" + i);
                    queue.put(i);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Customer implements Runnable {

        private LinkedBlockingQueue<Integer> queue;

        public Customer(LinkedBlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Integer remove = queue.take();
                    System.out.println("消费者" + Thread.currentThread().getName() + "  消费数据：" + remove);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
