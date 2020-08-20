package com.carfi.math.simple.stack;

import java.util.Stack;

/**
 * com.carfi.math.simple.stack$
 * 剑指 Offer 30. 包含min函数的栈
 * 一个栈存数据，另外一个存最小值就行
 * @author ll
 * @date 2020-08-19 14:44:25
 **/
public class MinFunctionStack30 {

    Stack<Integer> stackA;
    Stack<Integer> stackB;

    public MinFunctionStack30() {
        stackA = new Stack<>();
        stackB = new Stack<>();
    }

    public void push(int x) {
        stackA.push(x);
        if (stackB.empty()) {
            stackB.push(x);
        } else if (x <= stackB.peek()) {
            stackB.push(x);
        }
    }

    public void pop() {
        if (!stackA.empty()) {
            Integer pop = stackA.pop();
            if (pop.equals(stackB.peek())) {
                stackB.pop();
            }
        }
    }

    public int top() {
        if (stackA.empty()) {
            return -1;
        }
        return stackA.peek();
    }

    public int min() {
        return stackB.peek();
    }
}
