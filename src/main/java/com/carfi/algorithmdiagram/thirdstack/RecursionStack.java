package com.carfi.algorithmdiagram.thirdstack;

/**
 * com.carfi.algorithmdiagram.thirdstack$
 * 递归调用栈
 * @author ll
 * @date 2020-09-02 14:18:06
 **/
public class RecursionStack {
    public static void main(String[] args) {
        int result = getResult(5);
        System.out.println(result);
    }

    public static int getResult(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * getResult(num - 1);
        }
    }
}
