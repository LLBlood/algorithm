package com.carfi.datastruct.stackapplication.recursion;

/**
 * com.carfi.datastruct.stackapplication.recursion$
 *
 * @author ll
 * @date 2020-03-18 09:24:35
 **/
public class FibonacciSequence {
    public static int fBI(int n) {
        if (n < 2) {
            return n == 0 ? 0 : 1;
        } else {
            return fBI(n - 1) + fBI(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fBI(15));
    }
}
