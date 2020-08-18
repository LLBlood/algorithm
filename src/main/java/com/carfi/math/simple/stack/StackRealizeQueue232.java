package com.carfi.math.simple.stack;

import java.util.Stack;

/**
 * com.carfi.math.simple.stack$
 * 用栈实现队列
 * 1、栈的定义 后进先出；
 *    队列的定义 先进先出；
 * 2、思路：
 *    准备两个栈
 *    其中一个A栈用来存数据，另外一个B栈用来取数据
 *    一开始所有数据入A栈，出数据先将A栈数据转移到B栈
 *
 * @author ll
 * @date 2020-08-18 09:29:15
 **/
public class StackRealizeQueue232 {

    private Stack<Integer> stackA;
    private Stack<Integer> stackB;

    /** Initialize your data structure here. */
    public StackRealizeQueue232() {
        stackA = new Stack<>();
        stackB = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stackA.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (stackB.empty()) {
            while (!stackA.empty()) {
                Integer pop = stackA.pop();
                stackB.push(pop);
            }
        }
        return stackB.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (stackB.empty()) {
            while (!stackA.empty()) {
                Integer pop = stackA.pop();
                stackB.push(pop);
            }
        }
        return stackB.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackA.empty() && stackB.empty();
    }
}
