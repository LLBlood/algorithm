package com.carfi.math.simple;

/**
 * com.carfi.math.simple$
 * 二进制数相加
 * @author ll
 * @date 2020-06-23 14:55:13
 **/
public class BinarySum67 {
    public static void main(String[] args) {
        String a = "100";
        String b = "110010";

        String s = addBinary2(a, b);
        System.out.println(s);
    }
    public static String addBinary1(String a, String b) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        int alength = aChars.length - 1;
        int blength = bChars.length - 1;
        int index = aChars.length > bChars.length ? bChars.length : aChars.length;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while (alength >= 0 && blength >= 0) {
            int result = ((int) aChars[alength] - 48) + ((int) bChars[blength] - 48) + count;
            if (result == 0 || result == 1) {
                count = 0;
            } else if (result == 2) {
                result = 0;
                count = 1;
            } else {
                result = 1;
                count = 1;
            }
            sb.insert(0, result);
            alength--;
            blength--;
        }

        if (a.length() > index) {
            for (int i = aChars.length - index - 1; i >= 0 ; i--) {
                int result = ((int)aChars[i] - 48) + count;
                if (result == 0 || result == 1) {
                    count = 0;
                } else {
                    result = 0;
                    count = 1;
                }
                sb.insert(0, result);
            }
        } else if (b.length() > index) {
            for (int i = bChars.length - index - 1; i >= 0; i--) {
                int result = ((int)bChars[i] - 48) + count;
                if (result == 0 || result == 1) {
                    count = 0;
                } else {
                    result = 0;
                    count = 1;
                }
                sb.insert(0, result);
            }
        }

        if (count > 0) {
            sb.insert(0, count);
        }
        return sb.toString();
    }

    //talent
    public static String addBinary2(String a, String b) {
        while (a.length() > b.length()) {
            b = "0" + b;
        }
        while (b.length() > a.length()) {
            a = "0" + a;
        }
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i--) {
            int result = ((int) a.charAt(i) - 48) + ((int) b.charAt(i) - 48) + count;
            if (result == 0 || result == 1) {
                count = 0;
            } else if (result == 2) {
                result = 0;
                count = 1;
            } else {
                result = 1;
                count = 1;
            }
            sb.append(result);
        }
        if (count > 0) {
            sb.append(count);
        }
        return sb.reverse().toString();
    }
}
