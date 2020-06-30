package com.carfi.math.stack;

import java.util.Stack;

/**
 * com.carfi.math.stack$
 * 1047. 删除字符串中的所有相邻重复项
 * 可以压入栈的时候比较栈的第一个数与当前数是否相等，相等的话出栈，不相等就压入栈，最后得到的栈就是无相邻重复项的字符串
 * @author ll
 * @date 2020-06-30 15:22:27
 **/
public class RemoveAllAdjacentDuplicatesFromTheString1047 {
    public String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (!stack.empty()) {
                if (stack.peek() == c) {
                    stack.pop();
                    continue;
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
