package com.carfi.math.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * com.carfi.math.stack$
 * 下一个更大元素496
 * 给定两个 没有重复元素 的数组 nums1 和 nums2 ，其中nums1 是 nums2 的子集。找到 nums1 中每个元素在 nums2 中的下一个比其大的值。
 * nums1 中数字 x 的下一个更大元素是指 x 在 nums2 中对应位置的右边的第一个比 x 大的元素。如果不存在，对应位置输出 -1 。
 * 利用Stack在存储nums2的过程中，比较是否存在更大元素
 * nums转list
 * @author ll
 * @date 2020-07-01 09:59:35
 **/
public class TheNextBiggerElement496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            while (!stack.empty()) {
                Integer peek = stack.peek();
                if (peek < nums2[i]) {
                    map.put(stack.pop(), nums2[i]);
                } else {
                    break;
                }
            }
            stack.push(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                result[i] = map.get(nums1[i]);
            } else {
                result[i] = -1;
            }
        }
        return result;
    }
}
