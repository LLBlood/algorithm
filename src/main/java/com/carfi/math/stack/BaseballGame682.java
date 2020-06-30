package com.carfi.math.stack;

import java.util.Stack;

/**
 * com.carfi.math.stack$
 * 682. 棒球比赛
 * 给定一个字符串列表，每个字符串可以是以下四种类型之一：
 * 1.整数（一轮的得分）：直接表示您在本轮中获得的积分数。
 * 2. "+"（一轮的得分）：表示本轮获得的得分是前两轮有效 回合得分的总和。
 * 3. "D"（一轮的得分）：表示本轮获得的得分是前一轮有效 回合得分的两倍。
 * 4. "C"（一个操作，这不是一个回合的分数）：表示您获得的最后一个有效 回合的分数是无效的，应该被移除。
 *
 * 每一轮的操作都是永久性的，可能会对前一轮和后一轮产生影响
 *
 * 利用栈记录分数，遇到需要前几轮的操作时，先出栈，统计完分数，再入栈，至于是否是正确的记录不管
 * @author ll
 * @date 2020-06-30 15:53:13
 **/
public class BaseballGame682 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (String op : ops) {
            switch (op) {
                case "+":
                    Integer first = stack.pop();
                    Integer second = stack.pop();
                    Integer current = second + first;
                    stack.push(second);
                    stack.push(first);
                    stack.push(current);
                    break;
                case "D":
                    Integer Dfirst = stack.pop();
                    Integer Dcurrent = Dfirst * 2;
                    stack.push(Dfirst);
                    stack.push(Dcurrent);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.parseInt(op));
                    break;
            }
        }
        while (!stack.empty()) {
            result += stack.pop();
        }
        return result;
    }
}
