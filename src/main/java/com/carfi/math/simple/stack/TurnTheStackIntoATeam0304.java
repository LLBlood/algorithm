package com.carfi.math.simple.stack;

import java.util.Stack;

/**
 * com.carfi.math.stack$
 * 面试题 03.04. 化栈为队
 * 用两个栈来表示队列
 * 栈先进后出，队列先进先出
 * 第一个栈顺序入栈，可以看出数据与队列完全相反
 * 但是将第一个栈数据压入第二个栈，此时的数据与队列一样
 * 当Read栈有数据，说明该数据与队列一样，再有数据入队列，先放到write里面，直到read无数据
 * @author ll
 * @date 2020-06-30 15:08:05
 **/
public class TurnTheStackIntoATeam0304 {

    private Stack<Integer> stackWrite;
    private Stack<Integer> stackRead;

    /** Initialize your data structure here. */
    public TurnTheStackIntoATeam0304() {
        stackWrite= new Stack();
        stackRead= new Stack();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stackWrite.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (!stackRead.empty()) {
            return stackRead.pop();
        }
        while (!stackWrite.empty()) {
            stackRead.push(stackWrite.pop());
        }
        return stackRead.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (!stackRead.empty()) {
            return stackRead.peek();
        }
        while (!stackWrite.empty()) {
            stackRead.push(stackWrite.pop());
        }
        return stackRead.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackWrite.empty() && stackRead.empty();
    }
}
