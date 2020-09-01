package com.carfi.math.simple.sort;

import java.util.Arrays;

/**
 * com.carfi.math.simple.sort$
 * 976. 三角形的最大周长
 * @author ll
 * @date 2020-09-01 17:44:56
 **/
public class MaxCircumTrian976 {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        int index = A.length - 1;
        int leng = 0;
        while (index >= 2) {
            int max1 = A[index];
            int max2 = A[index-1];
            int max3 = A[index-2];
            if (max1 == 0 || max2 == 0 || max3 == 0) {
                break;
            }
            if (max2 + max3 > max1) {
                return max1 + max2 + max3;
            } else {
                index--;
            }
        }
        return leng;
    }
}
