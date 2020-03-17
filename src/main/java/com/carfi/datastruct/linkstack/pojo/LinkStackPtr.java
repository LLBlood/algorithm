package com.carfi.datastruct.linkstack.pojo;

/**
 * com.carfi.datastruct.linkstack.pojo$
 *
 * @author ll
 * @date 2020-03-17 15:10:15
 **/
public class LinkStackPtr {
    private Integer data;
    private LinkStackPtr next;

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public LinkStackPtr getNext() {
        return next;
    }

    public void setNext(LinkStackPtr next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "LinkStackPtr{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
