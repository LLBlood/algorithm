package com.carfi.math.simple.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * com.carfi.math.simple.heap$
 * 1046. 最后一块石头的重量
 *  还是PriorityQueue是内置队列
 * @author ll
 * @date 2020-08-20 14:26:42
 **/
public class LastStoneWeight1046 {
    private PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });
    public int lastStoneWeight(int[] stones) {
        for (int stone : stones) {
            queue.add(stone);
        }
        return stoneWeightArr(queue);
    }

    public int stoneWeightArr(PriorityQueue<Integer> queue) {
        if (queue.size() == 1) {
            return queue.poll();
        } else if (queue.isEmpty()) {
            return 0;
        } else {
            int abs = Math.abs(queue.poll() - queue.poll());
            if (abs > 0) {
                queue.add(abs);
            }
            return stoneWeightArr(queue);
        }
    }

    public static void main(String[] args) {
        int i = new LastStoneWeight1046().lastStoneWeight(new int[]{1, 3});
        System.out.println(i);
    }
}
