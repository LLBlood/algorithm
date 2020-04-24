package com.carfi.javabase.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * com.carfi.javabase.socket$
 * ServerSocket serverSocket = new ServerSocket(12555);
 * Socket accept = serverSocket.accept();
 * accept.getInputStream()
 *
 * accept是接收一个新的请求，如果没有新的请求就会堵塞
 * accept.getInputStream()等流如果没有新的数据进入，也会堵塞，直到有信息进入
 * @author ll
 * @date 2020-04-24 08:42:33
 **/
public class SimpleSocketServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12555);
        Socket accept = serverSocket.accept();
        while (true) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
            String s = bufferedReader.readLine();
            System.out.println(s);

            PrintWriter printWriter = new PrintWriter(accept.getOutputStream());
            printWriter.println("我真的觉得你是个憨批");
            printWriter.flush();
        }
    }
}
