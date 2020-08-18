package com.carfi.math.simple.stack;

import java.util.Stack;

/**
 * com.carfi.math.simple$
 *
 * @author ll
 * @date 2020-08-14 14:17:49
 **/
public class ValidBrackets20 {
    public static void main(String[] args) {
        boolean valid = new ValidBrackets20().isValid("[{}[]][]");
        System.out.println(valid);
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.add(c);
            } else if (stack.empty()) {
                return false;
            } else {
                Character pop = stack.pop();
                if (c == ')' && !pop.equals('(')) {
                    return false;
                }
                if (c == ']' && !pop.equals('[')) {
                    return false;
                }
                if (c == '}' && !pop.equals('{')) {
                    return false;
                }
            }
        }
        if (!stack.empty()) {
            return false;
        }
        return true;
    }
}
