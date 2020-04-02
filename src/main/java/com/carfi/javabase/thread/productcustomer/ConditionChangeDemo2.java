package com.carfi.javabase.thread.productcustomer;

import java.util.ArrayList;
import java.util.List;

/**
 * com.carfi.javabase.thread.productcustomer$
 * 在使用线程的等待/通知机制时，一般都要在 while 循环中调用 wait()方法，因此配合使用一个 boolean 变量（或其他能判断真假的条件，
 * 如本文中的 list.isEmpty()），满足 while 循环的条件时，进入 while 循环，执行 wait()方法，不满足 while 循环的条件时，跳出循环，执行后面的代码
 **/
public class ConditionChangeDemo2 {
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
                    while (lock.isEmpty()) {
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
