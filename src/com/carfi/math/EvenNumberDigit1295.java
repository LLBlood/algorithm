package com.carfi.math;

/**
 * com.carfi.math$
 * 1295. 统计位数为偶数的数字<br/>
 * 给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。<br/>
 * @author ll
 * @date 2020-01-13 14:10:38
 **/
public class EvenNumberDigit1295 {
    /**
     * 思路：
     *      1、遍历数组，取出每个数
     *      2、对10取余数，直到商为0停止
     * @param nums
     * @return
     */
    public int findNumbers(int[] nums) {
        /**
         * 统计偶数次数
         */
        int eventCount = 0;
        for (int num : nums) {
            int event = 1;
            for (int i = num; i / 10 != 0; i /= 10) {
                event++;
            }
            if (event % 2 == 0) {
                eventCount++;
            }
        }
        return eventCount;
    }

    /**
     * 思路：
     *      1、遍历数组，取出每个数
     *      2、对10取余数，直到商为0停止
     * @param nums
     * @return
     */
    public int findNumbers2(int[] nums) {
        /**
         * 统计偶数次数
         */
        int eventCount = 0;
        for (int num : nums) {
            int event = 0;
            event = getCount(event, num);
            if (event % 2 == 0) {
                eventCount++;
            }
        }
        return eventCount;
    }
    public int findNumbers3(int[] nums) {
        /**
         * 统计偶数次数位数   10^k-1<x<10^k
         */
        int eventCount = 0;
        for (int num : nums) {
            if ((int)(Math.log10(num) + 1) % 2 == 0) {
                ++eventCount;
            }
        }
        return eventCount;
    }

    private int getCount(int event, int num) {
        event++;
        num = num / 10;
        if ( num != 0) {
            return getCount(event, num);
        }
        return event;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{12,345,2,6,7896};
        int numbers = new EvenNumberDigit1295().findNumbers(nums);
        System.out.println(numbers);
    }
}
