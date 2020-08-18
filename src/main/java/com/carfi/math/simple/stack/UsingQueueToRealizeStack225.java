package com.carfi.math.simple.stack;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * com.carfi.math.stack$
 * 225. 用队列实现栈
 * @author ll
 * @date 2020-06-30 16:19:00
 **/
public class UsingQueueToRealizeStack225 {
    private Queue<Integer> queueIntput;
    private Queue<Integer> queueOutput;
    /** Initialize your data structure here. */
    public UsingQueueToRealizeStack225() {
        queueIntput = new LinkedBlockingQueue<>();
        queueOutput = new LinkedBlockingQueue<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queueIntput.offer(x);
        while (!queueOutput.isEmpty()) {
            queueIntput.offer(queueOutput.poll());
        }
        Queue<Integer> temp = queueIntput;
        queueIntput = queueOutput;
        queueOutput = temp;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queueOutput.poll();
    }

    /** Get the top element. */
    public int top() {
        return queueOutput.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queueOutput.isEmpty();
    }
}
