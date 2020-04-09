package com.carfi.javabase.thread.synchronizedtest;

/**
 * com.carfi.javabase.thread.synchronizedtest$
 *
 * @author ll
 * @date 2020-04-07 09:11:40
 **/
public class SychronizedMethod {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            new Thread() {
                @Override
                public void run() {
                    synchronized (SychronizedMethod.class) {
                        System.out.println("线程启动中==============>");
                        System.out.println("新建方法中==============>");
                        getMethod();
                    }
                }
            }.start();
        }
    }

    private static void getMethod() {
        System.out.println("进入测试方法==============>");
        try {
            System.out.println("睡眠中==============>");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("结束睡眠==============>");
    }
}
