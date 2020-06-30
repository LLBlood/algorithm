package com.carfi.math.simple;

/**
 * com.carfi.math.simple$
 * 非递减数列
 * 给你一个长度为 n 的整数数组，请你判断在 最多 改变 1 个元素的情况下，该数组能否变成一个非递减数列。
 * 我们是这样定义一个非递减数列的： 对于数组中所有的 i (0 <= i <= n-2)，总满足 nums[i] <= nums[i + 1]。
 *
 * 数列中不能出现两次以上的相邻递减数
 * 因为可以动手调整，而整个数列是递增或者想等的概念，也就是说调整的过程，要看产生变化的地方a，a与a的前第二个数据的大小比值，以此确定调整数值取值
 * @author ll
 * @date 2020-06-29 09:21:04
 **/
public class NonRecursiveSubractionColumn665 {
    public static void main(String[] args) {

    }
    public static boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length && count <= 1; i++) {
            if (nums[i] >= nums[i - 1]) {
                continue;
            }
            count++;
            if (i - 2 >= 0 && nums[i] < nums[i - 2]) {
                nums[i] = nums[i - 1];
            } else {
                nums[i - 1] = nums[i];
            }
        }
        return count <= 1;
    }
}
