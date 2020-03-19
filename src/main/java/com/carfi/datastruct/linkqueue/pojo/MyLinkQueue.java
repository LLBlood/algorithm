package com.carfi.datastruct.linkqueue.pojo;

/**
 * com.carfi.datastruct.queue.pojo$
 *
 * @author ll
 * @date 2020-03-19 09:32:35
 **/
public class MyLinkQueue {
    private int data;
    private MyLinkQueue next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public MyLinkQueue getNext() {
        return next;
    }

    public void setNext(MyLinkQueue next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "MyLinkQueue{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
