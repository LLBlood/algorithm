package com.carfi.math.simple.greedy;

import java.util.Arrays;

/**
 * com.carfi.math.simple.greedy$
 * 1005. K 次取反后最大化的数组和
 * @author ll
 * @date 2020-08-25 15:11:04
 **/
public class MaximumSum1005 {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        int sum = 0;
        int minIndex = 0;
        while (K > 0) {
            K--;
            A[minIndex] = -A[minIndex];
            if (minIndex < A.length - 1 && A[minIndex] > A[minIndex+1]) {
                minIndex++;
            }
        }
        for (int i : A) {
            sum += i;
        }
        return sum;
    }

}
