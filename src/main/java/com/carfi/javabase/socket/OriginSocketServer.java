package com.carfi.javabase.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * com.carfi.javabase.socket$
 *
 * @author ll
 * @date 2020-04-24 11:35:57
 **/
public class OriginSocketServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket accept = serverSocket.accept();
        while (true) {
            System.out.println("11111");
            InputStream inputStream = accept.getInputStream();
            System.out.println("22222");
            byte[] bytes = new byte[1024];
            int len = 0;
            StringBuilder sb = new StringBuilder();
            while ((len = inputStream.read(bytes)) != -1) {
                System.out.println("44444");
                String s = new String(bytes, 0, len);
                sb.append(s);
                if (s.contains("#fffff#")) {
                    break;
                }
            }
            System.out.println("33333");
            System.out.println(sb.toString());

            OutputStream outputStream = accept.getOutputStream();
            outputStream.write("来及#fffff#".getBytes());
            outputStream.flush();
        }
    }
}
