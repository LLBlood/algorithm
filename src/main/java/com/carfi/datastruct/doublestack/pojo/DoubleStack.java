package com.carfi.datastruct.doublestack.pojo;

import java.util.Arrays;

/**
 * com.carfi.datastruct.stack.pojo$
 *
 * @author ll
 * @date 2020-03-17 13:19:32
 **/
public class DoubleStack {
    private int[] data;
    private int top1;
    private int top2;

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int getTop1() {
        return top1;
    }

    public void setTop1(int top1) {
        this.top1 = top1;
    }

    public int getTop2() {
        return top2;
    }

    public void setTop2(int top2) {
        this.top2 = top2;
    }

    @Override
    public String toString() {
        return "DoubleStack{" +
                "data=" + Arrays.toString(data) +
                ", top1=" + top1 +
                ", top2=" + top2 +
                '}';
    }
}
