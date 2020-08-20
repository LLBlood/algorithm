package com.carfi.math.simple.heap;

import java.util.PriorityQueue;

/**
 * com.carfi.math.simple.heap$
 * 剑指 Offer 40. 最小的k个数
 * @author ll
 * @date 2020-08-20 14:41:55
 **/
public class MinKElement40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] minArr = new int[k];
        int index = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i : arr) {
            queue.add(i);
        }
        while (queue.size() > arr.length - k) {
            minArr[index++] = queue.poll();
        }
        return minArr;
    }
}
