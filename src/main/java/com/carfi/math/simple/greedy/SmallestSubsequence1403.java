package com.carfi.math.simple.greedy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * com.carfi.math.simple.greedy$
 * 1403. 非递增顺序的最小子序列
 * @author ll
 * @date 2020-08-27 10:14:52
 **/
public class SmallestSubsequence1403 {
    public List<Integer> minSubsequence(int[] nums) {
        int sum = 0;
        int temp = 0;
        List<Integer> list = new LinkedList<>();
        for (int num : nums) {
            sum += num;
        }
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            temp += nums[i];
            list.add(nums[i]);
            if (2 * temp > sum) {
                break;
            }
        }
        return list;
    }
}
