package com.carfi.math.simple.stack;

import java.util.Stack;

/**
 * com.carfi.math.simple.stack$
 * 剑指 Offer 09. 用两个栈实现队列
 * @author ll
 * @date 2020-08-19 14:21:44
 **/
public class StackToQueue9 {

    public Stack<Integer> stackA;
    public Stack<Integer> stackB;

    public StackToQueue9() {
        stackA = new Stack<>();
        stackB = new Stack<>();
    }

    public void appendTail(int value) {
        stackA.push(value);
    }

    public int deleteHead() {
        if (stackB.empty()) {
            if (stackA.empty()) {
                return -1;
            } else {
                while (!stackA.empty()) {
                    stackB.push(stackA.pop());
                }
                return stackB.pop();
            }
        } else {
            return stackB.pop();
        }
    }
}
