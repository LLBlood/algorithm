package com.carfi.datastruct.linkqueue.test;

import com.carfi.datastruct.linkqueue.pojo.Elem;
import com.carfi.datastruct.linkqueue.pojo.MyLinkQueuePointer;
import com.carfi.datastruct.linkqueue.util.MyLinkQueueUtil;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * com.carfi.datastruct.linkqueue.test$
 *
 * @author ll
 * @date 2020-03-19 10:57:02
 **/
public class MyLinkQueueUtilTest {
    @Test
    public void testEnQueue() {
        MyLinkQueuePointer myLinkQueuePointer = MyLinkQueueUtil.init();
        boolean b = MyLinkQueueUtil.enQueue(myLinkQueuePointer, new Elem(55));
        System.out.println(myLinkQueuePointer.toString());
    }

    @Test
    public void testDeQueue() {
        MyLinkQueuePointer myLinkQueuePointer = MyLinkQueueUtil.init();
        boolean b = MyLinkQueueUtil.enQueue(myLinkQueuePointer, new Elem(55));
        System.out.println(myLinkQueuePointer.toString());
        Elem elem = new Elem();
        MyLinkQueueUtil.deQueue(myLinkQueuePointer, elem);
        System.out.println(elem.getValue());
        System.out.println(myLinkQueuePointer.toString());
    }

    @Test
    public void test() throws ParseException {
        String time = "20121213 23:56:12";
        Date parse = new SimpleDateFormat("yyyyMMdd HH:mm:ss").parse(time);
        System.out.println(parse);
    }
}
