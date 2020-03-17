package com.carfi.datastruct.linkstack.pojo;

/**
 * com.carfi.datastruct.linkstack.pojo$
 *
 * @author ll
 * @date 2020-03-17 15:13:08
 **/
public class LinkStack {
    private LinkStackPtr top;
    private int count;

    public LinkStackPtr getTop() {
        return top;
    }

    public void setTop(LinkStackPtr top) {
        this.top = top;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "LinkStack{" +
                "top=" + top +
                ", count=" + count +
                '}';
    }
}
