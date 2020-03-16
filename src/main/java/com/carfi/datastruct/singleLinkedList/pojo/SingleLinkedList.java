package com.carfi.datastruct.singleLinkedList.pojo;

/**
 * com.carfi.datastruct.singleLinkedList.pojo$
 *
 * @author ll
 * @date 2020-03-16 13:24:19
 **/
public class SingleLinkedList {
    private Integer data;
    private SingleLinkedList nextList;

    public SingleLinkedList() {
        int i = 1;
        this.nextList = new SingleLinkedList(i+1);
        this.nextList.nextList = new SingleLinkedList(i+2);
        this.nextList.nextList.nextList = new SingleLinkedList(i+3);
    }

    public SingleLinkedList(Integer data) {
        this.data = data;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public SingleLinkedList getNextList() {
        return nextList;
    }

    public void setNextList(SingleLinkedList nextList) {
        this.nextList = nextList;
    }

    @Override
    public String toString() {
        return "SingleLinkedList{" +
                "data=" + data +
                ", nextList=" + nextList +
                '}';
    }
}
