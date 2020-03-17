package com.carfi.datastruct.linkstack.test;

import com.carfi.datastruct.linkstack.pojo.Elem;
import com.carfi.datastruct.linkstack.pojo.LinkStack;
import com.carfi.datastruct.linkstack.util.LinkStackUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * com.carfi.datastruct.linkstack.test$
 *
 * @author ll
 * @date 2020-03-17 15:21:27
 **/
public class LinkStackUtilTest {
    @Test
    public void testPush() {
        LinkStack linkStack = LinkStackUtil.initLinkStack();
        System.out.println(linkStack.toString());
        boolean push = LinkStackUtil.push(linkStack, new Elem(3));
        System.out.println(push);
        System.out.println(linkStack.toString());
        boolean push1 = LinkStackUtil.push(linkStack, new Elem(4));
        System.out.println(push1);
        System.out.println(linkStack.toString());
    }

    @Test
    public void testPop() {
        LinkStack linkStack = LinkStackUtil.initLinkStack();
        System.out.println(linkStack.toString());
        boolean push = LinkStackUtil.push(linkStack, new Elem(3));
        System.out.println(push);
        System.out.println(linkStack.toString());
        boolean push1 = LinkStackUtil.push(linkStack, new Elem(4));
        System.out.println(push1);
        System.out.println(linkStack.toString());

        Elem elem = new Elem();
        boolean pop = LinkStackUtil.pop(linkStack, elem);
        System.out.println(pop);
        System.out.println(linkStack.toString());
        System.out.println(elem.getValue());
    }

    @Test
    public void test() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);

        Set<Integer> set = new HashSet<>();
        set.addAll(list1);
        set.addAll(list2);
        for (Integer integer : set) {
            System.out.println(integer);
        }

    }
}
