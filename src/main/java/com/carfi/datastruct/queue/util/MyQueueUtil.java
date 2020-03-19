package com.carfi.datastruct.queue.util;

import com.carfi.datastruct.queue.pojo.Elem;
import com.carfi.datastruct.queue.pojo.MyQueue;

/**
 * com.carfi.datastruct.queue.util$
 *
 * @author ll
 * @date 2020-03-19 09:33:18
 **/
public class MyQueueUtil {
    public static MyQueue initQueue() {
        MyQueue myQueue = new MyQueue();
        int[] data = new int[20];
        myQueue.setData(data);
        myQueue.setFront(0);
        myQueue.setRare(0);
        return myQueue;
    }

    /**
     * 求循环队列的长度
     * @author ll
     * @date 2020-03-19 09:35:02
     * @param myQueue
     * @return int
     **/
    public static int getLength(MyQueue myQueue) {
        return (myQueue.getRare() - myQueue.getFront() + myQueue.getData().length) % myQueue.getData().length;
    }

    /**
     * 入队列的操作
     * @author ll
     * @date 2020-03-19 09:39:08
     * @param myQueue
     * @param e
     * @return boolean
     **/
    public static boolean enQueue(MyQueue myQueue, Elem e) {
        //先判断队列是否已满
        if ((myQueue.getRare() + 1) % myQueue.getData().length == myQueue.getFront()) {
            return false;
        }
        myQueue.getData()[myQueue.getRare()] = e.getValue();
        myQueue.setRare((myQueue.getRare() + 1) % myQueue.getData().length);
        return true;
    }

    /**
     * 出队列的操作
     * @author ll
     * @date 2020-03-19 09:44:59
     * @param myQueue
     * @param e
     * @return boolean
     **/
    public static boolean deQueue(MyQueue myQueue, Elem e) {
        //判断是否为空
        if (myQueue.getRare() == myQueue.getFront()) {
            return false;
        }
        int datum = myQueue.getData()[myQueue.getFront()];
        e.setValue(datum);
        myQueue.setFront((myQueue.getFront() + 1) % myQueue.getData().length);
        return true;
    }
}
