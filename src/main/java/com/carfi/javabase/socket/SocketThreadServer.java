package com.carfi.javabase.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * com.carfi.javabase.socket$
 *
 * @author ll
 * @date 2020-10-10 10:38:04
 **/
public class SocketThreadServer {

    private static Object obj1 = new Object();
    private static Object obj2 = new Object();

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(12555);
        Socket accept = serverSocket.accept();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("11111111111111111111111111");
                    synchronized (obj1) {
                        try {
                            obj1.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("2222222222222222222222222222222");
                    synchronized (obj2) {
                        try {
                            obj2.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();

        while (true) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
            String s = bufferedReader.readLine();
            if (s.equals("start msg1")) {
                synchronized (obj1) {
                    obj1.notifyAll();
                }
            } else if (s.equals("start msg2")) {
                synchronized (obj2) {
                    obj2.notifyAll();
                }
            }

            PrintWriter printWriter = new PrintWriter(accept.getOutputStream());
            printWriter.println("我真的觉得你是个憨批");
            printWriter.flush();
        }
    }
}
