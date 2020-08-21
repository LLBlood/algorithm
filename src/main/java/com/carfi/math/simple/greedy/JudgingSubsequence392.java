package com.carfi.math.simple.greedy;

/**
 * com.carfi.math.simple.greedy$
 * 392. 判断子序列
 *  示例 1:
 * s = "abc", t = "ahbgdc"
 * 返回 true.
 * 示例 2:
 * s = "axc", t = "ahbgdc"
 * 返回 false.
 * @author ll
 * @date 2020-08-21 09:13:49
 **/
public class JudgingSubsequence392 {
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int temp = t.indexOf(c, index);
            if (temp == -1) {
                return false;
            }
            index = temp + 1;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean subsequence = new JudgingSubsequence392().isSubsequence("aaaaaa", "bbaaaa");
        System.out.println(subsequence);
    }
}
