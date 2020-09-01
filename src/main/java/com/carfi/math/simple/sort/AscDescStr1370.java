package com.carfi.math.simple.sort;

import java.util.Arrays;

/**
 * com.carfi.math.simple.sort$
 * 1370. 上升下降字符串
 * @author ll
 * @date 2020-09-01 09:33:48
 **/
public class AscDescStr1370 {
    public String sortString(String s) {
        char[] charArr = new char[26];
        char[] chars = s.toCharArray();
        for (char c : chars) {
            charArr[c-'a'] += 1;
        }
        int index = 0;
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder();
        while (index < chars.length) {
            char temp = 0;
            for (int i = 0; i < chars.length; i++) {
                char aChar = chars[i];
                if (charArr[aChar-'a'] > 0 && aChar > temp) {
                    sb.append(aChar);
                    index++;
                    temp = aChar;
                    charArr[aChar-'a'] -= 1;
                }
            }
            temp = 'z' + '1';
            for (int i = chars.length - 1; i >= 0; i--) {
                char aChar = chars[i];
                if (charArr[aChar-'a'] > 0 && aChar < temp) {
                    sb.append(aChar);
                    index++;
                    temp = aChar;
                    charArr[aChar-'a'] -= 1;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        new AscDescStr1370().sortString("aaaabbbbcccc");
    }
}
