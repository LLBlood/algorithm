package com.carfi.math.stack;

import java.util.Stack;

/**
 * com.carfi.math.stack$
 * 1021删除最外层括号
 * ()() -> ""
 * (())(()()) -> ()()()
 *
 * 首先先将所有括号入栈
 * 在弹出的过程中统计括号数量） +1 （-1 当统计数量归0时，去掉临时生成字符串首尾，即是当前部分的剩余括号字符串
 * 当栈弹完时，结束
 *
 *
 * 第二种，遇到左括号就进栈，遇到右括号就出栈，如果此时栈不为空，那就说明栈中已经存在左括号非最外层
 * @author ll
 * @date 2020-06-30 11:12:57
 **/
public class RemoveTheOutermostBracket1021 {
    public static void main(String[] args) {
        String S = "(())(()())";
        String s = removeOuterParentheses(S);
        String s1 = removeOuterParentheses2(S);
        System.out.println(s);
        System.out.println(s1);
    }
    public static String removeOuterParentheses(String S) {
        String result = "";
        StringBuilder sb = new StringBuilder();
        Stack<Character> characters = new Stack<>();
        for (int i = S.length() - 1; i >= 0; i--) {
            characters.push(S.charAt(i));
        }
        int num = 0;
        while (!characters.empty()) {
            Character peek = characters.pop();
            if (peek == '(') {
                num++;
            } else {
                num--;
            }
            sb.append(peek);
            if (num == 0) {
                sb.deleteCharAt(0);
                sb.deleteCharAt(sb.length() - 1);
                result += sb.toString();
                sb = new StringBuilder();
            }
        }
        return result;
    }

    public static String removeOuterParentheses2(String S) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char temp = S.charAt(i);
            //当前输入参数为右括号，栈出栈
            if (temp == ')') {
                characters.pop();
            }
            //如果此时栈不为空，就说明这个括号不是最外层括号，可以添加
            if (!characters.empty()) {
                sb.append(temp);
            }
            //如果输入参数为左括号，栈入栈
            if (temp == '(') {
                characters.push(temp);
            }
        }
        return sb.toString();
    }
}
