package com.carfi.datastruct.doublestack.util;

import com.carfi.datastruct.doublestack.pojo.DoubleStack;
import com.carfi.datastruct.doublestack.pojo.Elem;

/**
 * com.carfi.datastruct.doublestack.util$
 *
 * @author ll
 * @date 2020-03-17 14:15:17
 **/
public class DoubleStackUtil {

    /**
     * 初始化
     * @author ll
     * @date 2020-03-17 14:16:52
     * @return com.carfi.datastruct.doublestack.pojo.DoubleStack
     **/
    public static DoubleStack initDoubleStack() {
        DoubleStack doubleStack = new DoubleStack();
        int[] ints = new int[20];
        int top1 = -1;
        int top2 = ints.length;
        doubleStack.setData(ints);
        doubleStack.setTop1(top1);
        doubleStack.setTop2(top2);
        return doubleStack;
    }

    /**
     * 入栈操作
     * @author ll
     * @date 2020-03-17 14:23:57
     * @param stack
     * @param e
     * @param stackNumber
     * @return boolean
     **/
    public static boolean push(DoubleStack stack, Elem e, int stackNumber) {
        if (stack.getTop1() + 1 == stack.getTop2()) {
            return false;
        }
        if (stackNumber == 1) {
            stack.setTop1(stack.getTop1() + 1);
            stack.getData()[stack.getTop1()] = e.getValue();
            return true;
        } else if (stackNumber == 2) {
            stack.setTop2(stack.getTop2() - 1);
            stack.getData()[stack.getTop2()] = e.getValue();
            return true;
        }
        return true;
    }

    /**
     * 出栈操作
     * @author ll
     * @date 2020-03-17 14:33:50
     * @param stack
     * @param e
     * @param stackNumber
     * @return boolean
     **/
    public static boolean pop(DoubleStack stack, Elem e, int stackNumber) {
        if (stackNumber == 1) {
            if (stack.getTop1() == -1) {
                return false;
            }
            e.setValue(stack.getData()[stack.getTop1()]);
            stack.setTop1(stack.getTop1() - 1);
        } else if (stackNumber == 2) {
            if (stack.getTop2() == stack.getData().length) {
                return false;
            }
            e.setValue(stack.getData()[stack.getTop2()]);
            stack.setTop2(stack.getTop2() + 1);
        }
        return true;
    }
}
