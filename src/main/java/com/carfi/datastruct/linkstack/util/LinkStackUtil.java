package com.carfi.datastruct.linkstack.util;

import com.carfi.datastruct.linkstack.pojo.Elem;
import com.carfi.datastruct.linkstack.pojo.LinkStack;
import com.carfi.datastruct.linkstack.pojo.LinkStackPtr;

/**
 * com.carfi.datastruct.linkstack.util$
 *
 * @author ll
 * @date 2020-03-17 15:15:17
 **/
public class LinkStackUtil {
    public static LinkStack initLinkStack() {
        LinkStack linkStack = new LinkStack();
        linkStack.setTop(null);
        linkStack.setCount(0);
        return linkStack;
    }

    /**
     * 链栈的入栈操作
     * @author ll
     * @date 2020-03-17 15:20:54
     * @param linkStack
     * @param e
     * @return boolean
     **/
    public static boolean push(LinkStack linkStack, Elem e) {
        LinkStackPtr linkStackPtr = new LinkStackPtr();
        linkStackPtr.setData(e.getValue());
        linkStackPtr.setNext(linkStack.getTop());
        linkStack.setTop(linkStackPtr);
        linkStack.setCount(linkStack.getCount() + 1);
        return true;
    }

    /**
     * 链栈的出栈操作
     * @author ll
     * @date 2020-03-17 15:25:50
     * @param linkStack
     * @param e
     * @return boolean
     **/
    public static boolean pop(LinkStack linkStack, Elem e) {
        if (linkStack.getTop() == null) {
            return false;
        }
        LinkStackPtr top = linkStack.getTop();
        e.setValue(top.getData());
        linkStack.setTop(top.getNext());
        linkStack.setCount(linkStack.getCount()-1);
        return true;
    }
}
