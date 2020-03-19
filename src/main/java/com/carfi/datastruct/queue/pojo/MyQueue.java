package com.carfi.datastruct.queue.pojo;

import java.util.Arrays;

/**
 * com.carfi.datastruct.queue.pojo$
 *
 * @author ll
 * @date 2020-03-19 09:32:35
 **/
public class MyQueue {
    private int[] data;
    private int front;  /*头指针*/
    private int rare;   /*尾指针，若队列不空，指向队列尾元素的下一个位置*/

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getRare() {
        return rare;
    }

    public void setRare(int rare) {
        this.rare = rare;
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "data=" + Arrays.toString(data) +
                ", front=" + front +
                ", rare=" + rare +
                '}';
    }
}
