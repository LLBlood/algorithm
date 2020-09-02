package com.carfi.math.simple.sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * com.carfi.math.simple.sort$
 * 1030. 距离顺序排列矩阵单元格
 * R x轴的坐标的极限值
 * C y轴坐标的极限值
 * @author ll
 * @date 2020-09-02 10:12:53
 **/
public class DistanceOrderCell1030 {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int maxNum = R*C;
        int index = 0;
        int[][] arr = new int[maxNum][2];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[index][0] = i;
                arr[index][1] = j;
                index++;
            }
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int xy1 = Math.abs(o1[0] - r0) + Math.abs(o1[1] - c0);
                int xy2 = Math.abs(o2[0] - r0) + Math.abs(o2[1] - c0);
                return xy1 - xy2;
            }
        });
        return arr;
    }
}
