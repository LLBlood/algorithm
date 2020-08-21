package com.carfi.math.simple.greedy;

import java.util.Arrays;

/**
 * com.carfi.math.simple.greedy$
 * 455. 分发饼干
 *  每次拿局部最好的，贪心算法
 * @author ll
 * @date 2020-08-21 09:50:53
 **/
public class DistributeBiscuits455 {
    public int findContentChildren(int[] g, int[] s) {
        int i = 0;
        int j = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                i++;
            }
            j++;
        }
        return i;
    }
}
