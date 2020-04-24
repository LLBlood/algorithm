package com.carfi.javabase.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * com.carfi.javabase.socket$
 *
 * @author ll
 * @date 2020-04-24 11:42:53
 **/
public class OriginSocketClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 6666);
        while (true) {
            byte[] bytes = new byte[1024];
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("垃圾#fffff#".getBytes());
            outputStream.flush();

            System.out.println("11111");
            InputStream inputStream = socket.getInputStream();
            System.out.println("22222");
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
        }
    }

}
