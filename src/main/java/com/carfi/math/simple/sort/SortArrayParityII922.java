package com.carfi.math.simple.sort;

/**
 * com.carfi.math.simple.sort$
 * 922. 按奇偶排序数组 II
 * @author ll
 * @date 2020-09-01 09:07:09
 **/
public class SortArrayParityII922 {
    public int[] sortArrayByParityII(int[] A) {
        int index1 = 0;
        int index2 = 1;
        int[] Z = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                Z[index1] = A[i];
                index1 += 2;
            } else {
                Z[index2] = A[i];
                index2 += 2;
            }
        }
        return Z;
    }
}
