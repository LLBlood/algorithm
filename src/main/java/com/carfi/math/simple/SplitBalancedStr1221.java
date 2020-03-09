package com.carfi.math.simple;

/**
 * com.carfi.math.simple$
 * 1221. 分割平衡字符串<br/>
 * 在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
 * 给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 * 返回可以通过分割得到的平衡字符串的最大数量
 * s = "RLRRLLRLRL"
 * s 可以分割为 "RL", "RRLL", "RL", "RL", 每个子字符串中都包含相同数量的 'L' 和 'R'。
 * @author ll
 * @date 2020-01-16 09:20:42
 **/
public class SplitBalancedStr1221 {
    public int balancedStringSplit(String s) {
        char[] chars = s.toCharArray();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            //将R记为1， L记为-1,当和为0，总数增加1次
            if (chars[i] == 'R') {
                sum++;
            }
            if (chars[i] == 'L') {
                sum--;
            }
            if (sum == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        int i = new SplitBalancedStr1221().balancedStringSplit(s);
        System.out.println(i);
    }
}
