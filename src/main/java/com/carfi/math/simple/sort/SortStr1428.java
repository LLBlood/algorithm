package com.carfi.math.simple.sort;

/**
 * com.carfi.math.simple.sort$
 * 1528. 重新排列字符串
 * @author ll
 * @date 2020-09-30 15:01:17
 **/
public class SortStr1428 {
    public String restoreString(String s, int[] indices) {
        char[] chars = s.toCharArray();
        char[] newChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            int index = indices[i];
            newChars[index] = aChar;
        }
        return new String(newChars);
    }

    public static void main(String[] args) {

    }
}
