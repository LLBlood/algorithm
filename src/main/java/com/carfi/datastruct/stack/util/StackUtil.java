package com.carfi.datastruct.stack.util;

import com.carfi.datastruct.stack.pojo.Elem;
import com.carfi.datastruct.stack.pojo.Stack;

/**
 * com.carfi.datastruct.stack.util$
 *
 * @author ll
 * @date 2020-03-17 13:20:33
 **/
public class StackUtil {
    /**
     * 初始化栈
     * @author ll
     * @date 2020-03-17 13:24:27
     * @return com.carfi.datastruct.stack.pojo.Stack
     **/
    public static Stack initStack() {
        Stack stack = new Stack();
        int[] data = new int[20];
        int top = -1;
        for (int i = 0; i < 5; i++) {
            data[i] = i * 3;
            top++;
        }
        stack.setData(data);
        stack.setTop(top);
        return stack;
    }

    /**
     * 进栈操作
     * @author ll
     * @date 2020-03-17 13:26:18
     * @param stack
     * @param e
     * @return void
     **/
    public static boolean push(Stack stack, Elem e) {
        if (stack.getTop() == stack.getData().length - 1) {
            return false;
        }
        stack.setTop(stack.getTop() + 1);
        stack.getData()[stack.getTop()] = e.getValue();
        return true;
    }

    /**
     * 出栈操作
     * @author ll
     * @date 2020-03-17 13:48:35
     * @param stack
     * @param e
     * @return boolean
     **/
    public static boolean pop(Stack stack, Elem e) {
        if (stack.getTop() == -1) {
            return false;
        }
        e.setValue(stack.getData()[stack.getTop()]);
        stack.setTop(stack.getTop() - 1);
        return true;
    }
}
