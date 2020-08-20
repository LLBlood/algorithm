package com.carfi.math.simple.heap;

import java.util.PriorityQueue;

/**
 * com.carfi.math.simple.heap$
 * 703. 数据流中的第K大元素
 *  PriorityQueue是内置队列，拥有默认自然排序方法，最大的在最后面
 * @author ll
 * @date 2020-08-20 14:13:52
 **/
public class DataMaxKElement703 {
    private PriorityQueue<Integer> queue;
    private int limit;

    public DataMaxKElement703(int k, int[] nums) {
        limit = k;
        queue = new PriorityQueue<>();
        for (int num : nums) {
            queue.add(num);
        }
    }

    public int add(int val) {
        queue.add(val);
        while (queue.size() > limit) {
            queue.poll();
        }
        return queue.peek();
    }
}
