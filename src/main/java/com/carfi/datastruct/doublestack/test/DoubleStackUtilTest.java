package com.carfi.datastruct.doublestack.test;

import com.carfi.datastruct.doublestack.pojo.DoubleStack;
import com.carfi.datastruct.doublestack.pojo.Elem;
import com.carfi.datastruct.doublestack.util.DoubleStackUtil;
import org.junit.Test;

/**
 * com.carfi.datastruct.doublestack.test$
 *
 * @author ll
 * @date 2020-03-17 14:24:29
 **/
public class DoubleStackUtilTest {
    @Test
    public void testPush() {
        DoubleStack doubleStack = DoubleStackUtil.initDoubleStack();
        System.out.println(doubleStack.toString());
        Elem elem = new Elem(5);
        boolean push = DoubleStackUtil.push(doubleStack, elem, 2);
        System.out.println(push);
        System.out.println(doubleStack.toString());
    }

    @Test
    public void testPop() {
        DoubleStack doubleStack = DoubleStackUtil.initDoubleStack();
        System.out.println(doubleStack.toString());
        Elem elem = new Elem(5);
        boolean push = DoubleStackUtil.push(doubleStack, elem, 2);
        System.out.println(push);
        System.out.println(doubleStack.toString());

        boolean pop1 = DoubleStackUtil.pop(doubleStack, elem, 1);
        System.out.println(pop1);
        System.out.println(doubleStack.toString());

        boolean pop2 = DoubleStackUtil.pop(doubleStack, elem, 2);
        System.out.println(pop2);
        System.out.println(doubleStack.toString());
    }
}
