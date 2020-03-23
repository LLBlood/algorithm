package com.carfi.javabase.thread.createthreadmethod;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * com.carfi.javabase.thread.createthreadmethod$
 *
 * @author ll
 * @date 2020-03-23 10:03:58
 **/
public class CallableFutureThread implements Callable<Integer> {
    @Override
    public Integer call() {
        try {
            System.out.println(Thread.currentThread().getName() + "线程启动中");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "call()方法执行中");
        return 1;
    }

    public static void main(String[] args) {
        FutureTask<Integer> integerFutureTask = new FutureTask<>(new CallableFutureThread());
        new Thread(integerFutureTask).start();
        try {
            System.out.println("最终结果"+integerFutureTask.get());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("main方法执行完毕");
    }
}
