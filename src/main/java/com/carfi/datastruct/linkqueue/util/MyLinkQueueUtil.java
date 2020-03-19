package com.carfi.datastruct.linkqueue.util;

import com.carfi.datastruct.linkqueue.pojo.Elem;
import com.carfi.datastruct.linkqueue.pojo.MyLinkQueue;
import com.carfi.datastruct.linkqueue.pojo.MyLinkQueuePointer;

/**
 * com.carfi.datastruct.linkqueue.util$
 *
 * @author ll
 * @date 2020-03-19 10:02:31
 **/
public class MyLinkQueueUtil {

    public static MyLinkQueuePointer init() {
        MyLinkQueuePointer myLinkQueuePointer = new MyLinkQueuePointer();
        MyLinkQueue myLinkQueue = new MyLinkQueue();
        myLinkQueuePointer.setRare(myLinkQueue);
        myLinkQueuePointer.setFront(myLinkQueue);
        return myLinkQueuePointer;
    }

    /**
     * 入队操作
     * @author ll
     * @date 2020-03-19 10:56:39
     * @param myLinkQueuePointer
     * @param e
     * @return boolean
     **/
    public static boolean enQueue(MyLinkQueuePointer myLinkQueuePointer, Elem e) {
        MyLinkQueue myLinkQueue = new MyLinkQueue();
        myLinkQueue.setData(e.getValue());
        myLinkQueue.setNext(null);
        if (myLinkQueuePointer.getFront() == null) {
            myLinkQueuePointer = MyLinkQueueUtil.init();
        }
        myLinkQueuePointer.getRare().setNext(myLinkQueue);
        myLinkQueuePointer.setRare(myLinkQueue);
        return true;
    }

    /**
     * 出队操作
     * @author ll
     * @date 2020-03-19 10:56:39
     * @param myLinkQueuePointer
     * @param e
     * @return boolean
     **/
    public static boolean deQueue(MyLinkQueuePointer myLinkQueuePointer, Elem e) {
        if (myLinkQueuePointer.getFront() == myLinkQueuePointer.getRare()) {
            return false;
        }
        MyLinkQueue next = myLinkQueuePointer.getFront().getNext();
        e.setValue(next.getData());
        myLinkQueuePointer.setFront(next.getNext());
        if (myLinkQueuePointer.getRare() == next) {
            myLinkQueuePointer.setRare(myLinkQueuePointer.getFront());
        }
        return true;
    }
}
