package com.carfi.math.simple.sort;

import java.util.Arrays;

/**
 * com.carfi.math.simple.sort$
 * 1502. 判断能否形成等差数列
 * @author ll
 * @date 2020-09-30 14:48:35
 **/
public class ArithmeticSequence1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (diff != arr[i+1] - arr[i]) {
                return false;
            }
        }
        return true;
    }
}
