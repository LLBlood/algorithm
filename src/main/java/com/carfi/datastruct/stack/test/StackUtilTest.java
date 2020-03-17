package com.carfi.datastruct.stack.test;

import com.carfi.datastruct.stack.pojo.Elem;
import com.carfi.datastruct.stack.pojo.Stack;
import com.carfi.datastruct.stack.util.StackUtil;
import org.junit.Test;

/**
 * com.carfi.datastruct.stack.test$
 *
 * @author ll
 * @date 2020-03-17 13:28:55
 **/
public class StackUtilTest {

    @Test
    public void testPush() {
        Stack stack = StackUtil.initStack();
        System.out.println(stack.toString());
        Elem elem = new Elem();
        elem.setValue(145);
        StackUtil.push(stack, elem);
        System.out.println(stack.toString());
    }

    @Test
    public void testPop() {
        Stack stack = StackUtil.initStack();
        System.out.println(stack.toString());
        Elem elem = new Elem();
        StackUtil.pop(stack, elem);
        StackUtil.pop(stack, elem);
        StackUtil.pop(stack, elem);
        StackUtil.pop(stack, elem);
        StackUtil.pop(stack, elem);
        boolean pop = StackUtil.pop(stack, elem);
        System.out.println(pop);
        System.out.println(stack.toString());
    }
}
