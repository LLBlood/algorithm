package com.carfi.math.simple;

/**
 * com.carfi.math.simple$
 * 1021. 删除最外层的括号
 * @author ll
 * @date 2020-01-16 09:54:28
 **/
public class RemoveOutBracket1021 {
    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int sum = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                sum++;
            }
            if (c == ')') {
                sum--;
            }
            sb.append(c);
            if (sum == 0) {
                sb.deleteCharAt(sb.length() - 1);
                sb.deleteCharAt(0);
                sb2.append(sb);
                sb.delete(0, sb.length());
            }
        }
        return sb2.toString();
    }
}
