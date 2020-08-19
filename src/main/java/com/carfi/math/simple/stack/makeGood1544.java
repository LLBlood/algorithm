package com.carfi.math.simple.stack;

import java.util.Stack;

/**
 * com.carfi.math.simple.stack$
 * 1544. 整理字符串
 * 输入：s = "leEeetcode"
 * 输出："leetcode"
 * 解释：无论你第一次选的是 i = 1 还是 i = 2，都会使 "leEeetcode" 缩减为 "leetcode" 。
 * 思路：
 *      相邻大小写字幕要被删除
 *      通过入栈来判定，每次入栈判断前一个数是不是转大小写
 * @author ll
 * @date 2020-08-19 09:52:33
 **/
public class makeGood1544 {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.empty()) {
                if (Math.abs(c - stack.peek()) == 32) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }
        while (!stack.empty()) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }
}
