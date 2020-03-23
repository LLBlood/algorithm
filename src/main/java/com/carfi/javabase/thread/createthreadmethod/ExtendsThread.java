package com.carfi.javabase.thread.createthreadmethod;

/**
 * com.carfi.javabase.thread.createthreadmethod$
 *
 * @author ll
 * @date 2020-03-23 09:59:52
 **/
public class ExtendsThread extends Thread{
    @Override
    public void run() {
        System.out.println("渣渣");
    }

    public static void main(String[] args) {
        new ExtendsThread().start();
    }
}
