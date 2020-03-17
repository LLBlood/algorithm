package com.carfi.datastruct.stack.pojo;

import java.util.Arrays;

/**
 * com.carfi.datastruct.stack.pojo$
 *
 * @author ll
 * @date 2020-03-17 13:19:32
 **/
public class Stack {
    private int[] data;
    private int top;

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "data=" + Arrays.toString(data) +
                ", top=" + top +
                '}';
    }
}
