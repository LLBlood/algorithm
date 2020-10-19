package com.carfi.thread;

import java.util.concurrent.Semaphore;

/**
 * com.carfi.thread$
 *
 * @author ll
 * @date 2020-10-19 14:17:21
 **/
public class PrintInOrder1114 {
    public Semaphore first_second = new Semaphore(0);
    public Semaphore second_third = new Semaphore(0);

    public PrintInOrder1114() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        first_second.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        first_second.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        second_third.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        second_third.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
