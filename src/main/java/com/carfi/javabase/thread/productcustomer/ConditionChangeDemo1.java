package com.carfi.javabase.thread.productcustomer;

import java.util.ArrayList;
import java.util.List;

/**
 * com.carfi.javabase.thread.productcustomer$
 * 在判断wait标识的时候，使用if可能遗漏判断
 * @author ll
 * @date 2020-04-02 09:20:27
 **/
public class ConditionChangeDemo1 {
    private static List<String> lockObject = new ArrayList<>();

    public static void main(String[] args) {
        Productor productor = new Productor(lockObject);
        Customer customer1 = new Customer(lockObject);
        Customer customer2 = new Customer(lockObject);
        customer1.start();
        customer2.start();
        productor.start();
    }

    static class Productor extends Thread {
        private List<String> lock;

        public Productor(List<String> lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " 开始添加元素");
                lock.add(Thread.currentThread().getName());
                lock.notifyAll();
            }
        }
    }

    static class Customer extends Thread {
        private List<String> lock;

        public Customer(List<String> lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            synchronized (lock) {
                try {
                    if (lock.isEmpty()) {
                        System.out.println(Thread.currentThread().getName() + " list为空");
                        System.out.println(Thread.currentThread().getName() + " 调用wait方法");
                        lock.wait();
                        System.out.println(Thread.currentThread().getName() + " wait方法结束");
                    }
                    String remove = lock.remove(0);
                    System.out.println(Thread.currentThread().getName() + " 取出第一个元素为: " + remove);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
