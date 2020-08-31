package com.carfi.math.simple.sort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * com.carfi.math.simple.sort$
 *
 * @author ll
 * @date 2020-08-31 15:05:41
 **/
public class TwoArraysInterseII350 {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new LinkedList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index1 = 0;
        int index2 = 0;
        while (index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] == nums2[index2]) {
                list.add(nums1[index1]);
                index1++;
                index2++;
            } else if (nums1[index1] < nums2[index2]) {
                index1++;
            } else {
                index2++;
            }
        }
        int[] nums3 = new int[list.size()];
        int index3 = 0;
        for (Integer integer : list) {
            nums3[index3++] = integer;
        }
        return nums3;
    }
}
