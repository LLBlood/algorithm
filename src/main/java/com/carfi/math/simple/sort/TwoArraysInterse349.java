package com.carfi.math.simple.sort;

import java.util.HashSet;
import java.util.Set;

/**
 * com.carfi.math.simple.sort$
 *
 * @author ll
 * @date 2020-08-31 15:05:41
 **/
public class TwoArraysInterse349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if (set.contains(i)) {
                set2.add(i);
            }
        }
        int[] nums = new int[set2.size()];
        int index = 0;
        for (Integer integer : set2) {
            nums[index++] = integer;
        }
        return nums;
    }
}
