package com.carfi.datastruct.lineartable.pojo;

import java.util.Arrays;

/**
 * com.carfi.datastruct.lineartable.pojo$
 *
 * @author ll
 * @date 2020-03-09 14:39:52
 **/
public class LinearTable {
    private int[] data;
    private int length;
    public LinearTable() {
        data = new int[20];
        for (int i = 0; i < 10; i++) {
            length++;
            data[i] = i;
        }
    }
    public int[] getData() {
        return data;
    }

    public void setData(final int[] data) {
        this.data = data;
    }

    public int getLength() {
        return length;
    }

    public void setLength(final int length) {
        this.length = length;
    }

    public static void main(String[] args) {
        System.out.println(new LinearTable().data.length);
    }

    @Override
    public String toString() {
        return "LinearTable{" +
                "data=" + Arrays.toString(data) +
                ", length=" + length +
                '}';
    }
}
