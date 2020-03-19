package com.carfi.datastruct.queue.test;

import com.carfi.datastruct.queue.pojo.Elem;
import com.carfi.datastruct.queue.pojo.MyQueue;
import com.carfi.datastruct.queue.util.MyQueueUtil;
import org.junit.Test;

/**
 * com.carfi.datastruct.queue.test$
 *
 * @author ll
 * @date 2020-03-19 09:36:23
 **/
public class MyQueueTest {

    @Test
    public void testGetLength() {
        MyQueue myQueue = MyQueueUtil.initQueue();
        int length = MyQueueUtil.getLength(myQueue);
        System.out.println(length);
    }

    @Test
    public void testEnQueue() {
        MyQueue myQueue = MyQueueUtil.initQueue();
        int length = MyQueueUtil.getLength(myQueue);
        System.out.println(length);
        MyQueueUtil.enQueue(myQueue, new Elem(5));
        System.out.println(myQueue.toString());
    }

    @Test
    public void testDuQueue() {
        MyQueue myQueue = MyQueueUtil.initQueue();
        int length = MyQueueUtil.getLength(myQueue);
        System.out.println(length);
        MyQueueUtil.enQueue(myQueue, new Elem(5));
        System.out.println(myQueue.toString());
        MyQueueUtil.enQueue(myQueue, new Elem(8));
        System.out.println(myQueue.toString());
        Elem elem = new Elem();
        MyQueueUtil.deQueue(myQueue, elem);
        System.out.println(myQueue.toString());
        System.out.println(elem.getValue());
        MyQueueUtil.deQueue(myQueue, elem);
        System.out.println(myQueue.toString());
        System.out.println(elem.getValue());
        MyQueueUtil.deQueue(myQueue, elem);
        System.out.println(myQueue.toString());
        System.out.println(elem.getValue());
    }

}
