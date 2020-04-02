package com.carfi.javabase.thread.productcustomer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * com.carfi.javabase.thread.productcustomer$
 *
 * @author ll
 * @date 2020-04-02 09:34:15
 **/
public class ProductorCustomerDemo1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        ThreadPoolExecutor pool = new ThreadPoolExecutor(15, 15, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(15));
        for (int i = 0; i < 5; i++) {
            pool.execute(new Productor(list, 8));
        }
        for (int i = 0; i < 10; i++) {
            pool.execute(new Customer(list));
        }
    }

    static class Productor implements Runnable {

        private List<Integer> list;
        private int maxLength;

        public Productor(List<Integer> list, int maxLength) {
            this.list = list;
            this.maxLength = maxLength;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (list) {
                    try {
                        while (list.size() == maxLength) {
                            System.out.println("生产者: " + Thread.currentThread().getName() + " list已经达到最大容量，进行wait");
                            list.wait();
                            System.out.println("生产者: " + Thread.currentThread().getName() + " 退出wait");
                        }
                        Random random = new Random();
                        int i = random.nextInt();
                        System.out.println("生产者: " + Thread.currentThread().getName() + " 生产数据" + i);
                        list.add(i);
                        list.notifyAll();
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class Customer implements Runnable {

        private List<Integer> list;

        public Customer(List<Integer> list) {
            this.list = list;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (list) {
                    try {
                        while (list.isEmpty()) {
                            System.out.println("消费者: " + Thread.currentThread().getName() + " list已经为空，进行wait");
                            list.wait();
                            System.out.println("消费者: " + Thread.currentThread().getName() + " 退出wait");
                        }
                        Integer remove = list.remove(0);
                        System.out.println("消费者" + Thread.currentThread().getName() + "  消费数据：" + remove);
                        list.notifyAll();
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
