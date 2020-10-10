package com.carfi.javabase.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * com.carfi.javabase.socket$
 *
 * @author ll
 * @date 2020-10-10 10:38:04
 **/
public class SocketThreadClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 12555);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入选项");
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            String next = scanner.nextLine();
            printWriter.println(next);
            printWriter.flush();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String s = bufferedReader.readLine();
            System.out.println(s);
        }
    }
}
