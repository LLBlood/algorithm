package com.carfi.math.simple.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * com.carfi.math.simple.greedy$
 * 1029. 两地调度
 * @author ll
 * @date 2020-08-27 09:45:33
 **/
public class TwoPlaceDisPatch1029 {
    public int twoCitySchedCost(int[][] costs) {
        int length = costs.length;
        int sum = 0;
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[0] - o1[1]) - (o2[0] - o2[1]);
            }
        });
        for (int i = 0, j = length - 1; i < length / 2; i++, j--) {
            sum += costs[i][0] + costs[j][1];
        }
        return sum;
    }
}
