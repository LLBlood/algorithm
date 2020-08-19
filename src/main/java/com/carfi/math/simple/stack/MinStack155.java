package com.carfi.math.simple.stack;

import java.util.Stack;

/**
 * com.carfi.math.simple$
 * 155. 最小栈
 * @author ll
 * @date 2020-08-14 15:43:32
 **/
public class MinStack155 {
    //一个栈放入数据
    private Stack<Integer> dateStack;
    private Stack<Integer> minStack;
    //一个栈用来存储最小值
    /** initialize your data structure here. */
    public MinStack155() {
        dateStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        dateStack.push(x);
        if (minStack.empty()) {
            minStack.push(x);
        } else {
            Integer peek = minStack.peek();
            if (x <= peek) {
                minStack.push(x);
            }
        }
    }

    public void pop() {
        Integer pop = dateStack.pop();
        Integer peek = minStack.peek();
        if (pop.equals(peek)) {
            minStack.pop();
        }
    }

    public int top() {
        return dateStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
