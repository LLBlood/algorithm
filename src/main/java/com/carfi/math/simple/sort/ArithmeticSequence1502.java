package com.carfi.math.simple.sort;

import java.util.Arrays;

/**
 * com.carfi.math.simple.sort$
 * 1528. 重新排列字符串
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
