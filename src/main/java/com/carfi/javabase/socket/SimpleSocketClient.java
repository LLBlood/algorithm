package com.carfi.javabase.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * com.carfi.javabase.socket$
 *
 * @author ll
 * @date 2020-04-24 08:42:48
 **/
public class SimpleSocketClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 12555);
        while (true) {
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            printWriter.println("发送书");
            printWriter.flush();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String s = bufferedReader.readLine();
            System.out.println(s);
        }

    }
}
