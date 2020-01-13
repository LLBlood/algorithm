package com.carfi.math;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * com.carfi.math$
 * 5143. 解压缩编码列表<br/>
 * 给你一个以行程长度编码压缩的整数列表 nums。<br/>
 * 考虑每相邻两个元素 [a, b] = [nums[2*i], nums[2*i+1]] （其中 i >= 0 ），每一对都表示解压后有 a 个值为 b 的元素。<br/>
 * 请你返回解压后的列表。<br/>
 * 输入：nums = [1,2,3,4]<br/>
 * 输出：[2,4,4,4]<br/>
 * @author ll
 * @date 2020-01-13 10:32:11
 **/
public class DecomList5143 {
    /**
     * 思路：1、i的取值取决于nums数组的最大范围；
     *      2、元素a代表元素b的数量，元素a的值是nums[2*i]，元素b的值是nums[2*i+1]
     *      3、组合最后的数组，a个b一直组合直到不满足条件
     */
    public int[] decompressRLElist1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        //确定i的最大取值范围
        int maxLength = (nums.length - 1) / 2;
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i <= maxLength; i++ ) {
            int countIndex = 2 * i;
            //a的取值
            int count = nums[countIndex];
            int valueIndex = 2 * i + 1;
            //b的取值
            int value = nums[valueIndex];
            for (int j = 0; j < count; j++) {
                list.add(value);
            }
        }
        int[] ints = new int[list.size()];
        for (int z = 0; z < list.size(); z++) {
            ints[z] = list.get(z);
        }

        return ints;
    }

    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<nums.length; i+=2) {
            for (int j=0; j<nums[i]; j++) {
                list.add(nums[i + 1]);
            }
        }
        int[] output = new int[list.size()];
        for (int i=0; i<output.length; i++) {
            output[i] = list.get(i);
        }
        return output;
    }
}
