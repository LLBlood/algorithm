package com.carfi.datastruct.linkqueue.pojo;

/**
 * com.carfi.datastruct.linkqueue.pojo$
 *
 * @author ll
 * @date 2020-03-19 09:54:44
 **/
public class MyLinkQueuePointer {
    private MyLinkQueue front; /*头指针*/
    private MyLinkQueue rare; /*尾指针*/

    public MyLinkQueue getFront() {
        return front;
    }

    public void setFront(MyLinkQueue front) {
        this.front = front;
    }

    public MyLinkQueue getRare() {
        return rare;
    }

    public void setRare(MyLinkQueue rare) {
        this.rare = rare;
    }

    @Override
    public String toString() {
        return "MyLinkQueuePointer{" +
                "front=" + front +
                ", rare=" + rare +
                '}';
    }
}
