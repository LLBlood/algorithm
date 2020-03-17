package com.carfi.datastruct.singleLinkedList.test;

import com.carfi.datastruct.singleLinkedList.pojo.Elem;
import com.carfi.datastruct.singleLinkedList.pojo.SingleLinkedList;
import com.carfi.datastruct.singleLinkedList.util.SimgleLinkedListUtil;
import org.junit.Test;

/**
 * com.carfi.datastruct.singleLinkedList.test$
 *
 * @author ll
 * @date 2020-03-16 13:38:21
 **/
public class SimgleLinkedListTest {
    @Test
    public void testGetElem() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        System.out.println(singleLinkedList.toString());
        Elem elem = new Elem();
        boolean flag = SimgleLinkedListUtil.getElem(singleLinkedList, 1, elem);
        System.out.println(flag);
        System.out.println(elem.getValue());
    }

    @Test
    public void testInsertElem() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        System.out.println(singleLinkedList.toString());
        Elem elem = new Elem();
        elem.setValue(56);
        boolean flag = SimgleLinkedListUtil.listInsert(singleLinkedList, 1, elem);
        System.out.println(flag);
        System.out.println(elem.getValue());
        System.out.println(singleLinkedList.toString());
    }

    @Test
    public void testDeleteElem() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        System.out.println(singleLinkedList.toString());
        Elem elem = new Elem();
        boolean flag = SimgleLinkedListUtil.listDelete(singleLinkedList, 1, elem);
        System.out.println(flag);
        System.out.println(elem.getValue());
        System.out.println(singleLinkedList.toString());
    }

    @Test
    public void testcreateListHead() {
        SingleLinkedList listHead = SimgleLinkedListUtil.createListHead(5);
        System.out.println(listHead.toString());
    }

    @Test
    public void testcreateListTail() {
        SingleLinkedList listTail = SimgleLinkedListUtil.createListTail(5);
        System.out.println(listTail.toString());
    }
}
