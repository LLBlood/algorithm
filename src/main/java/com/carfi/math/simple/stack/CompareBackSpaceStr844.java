package com.carfi.math.simple.stack;

import java.util.Stack;

/**
 * com.carfi.math.simple.stack$
 * 比较含退格的字符串
 * 当遇到#字符时，前一个字符需要被删除，就相当于入栈比较字符
 * @author ll
 * @date 2020-08-18 09:42:19
 **/
public class CompareBackSpaceStr844 {
    public boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }

    public String build(String S) {
        Stack<Character> ans = new Stack();
        for (char c: S.toCharArray()) {
            if (c != '#')
                ans.push(c);
            else if (!ans.empty())
                ans.pop();
        }
        return String.valueOf(ans);
    }
}
