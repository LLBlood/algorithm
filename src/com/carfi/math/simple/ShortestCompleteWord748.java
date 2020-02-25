package com.carfi.math.simple;

/**
 * com.carfi.math.simple$
 * 748.最短完整词
 * @author ll
 * @date 2020-01-17 16:24:10
 **/
public class ShortestCompleteWord748 {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        char[] arr = licensePlate.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                sb.append(c);
            }
        }
        String s = sb.toString().toLowerCase();
        int len = 0;
        String word = null;
        for (String str : words) {
            if (check(str, s)) {
                if (len == 0) {
                    len = str.length();
                    word = str;
                } else {
                    if (str.length() < len) {
                        len = str.length();
                        word = str;
                    }
                }
            }
        }
        return word;
    }

    private boolean check(String str, String s) {
        boolean flag = false;
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (str.indexOf(c) != -1) {
                str.replaceFirst(String.valueOf(c),"");
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        String[] str = new String[]{"step","steps","stripe","stepple"};
        String s = "1s3 PSt";
        new ShortestCompleteWord748().shortestCompletingWord(s, str);
    }
}
