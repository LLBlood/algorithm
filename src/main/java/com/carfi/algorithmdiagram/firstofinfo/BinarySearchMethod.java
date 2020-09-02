package com.carfi.algorithmdiagram.firstofinfo;

/**
 * com.carfi.algorithmdiagram.firstofinfo$
 * 二分查找法
 * 每次找中间的值，首先要确定该序列是有序的
 * 使用步骤次数 = log2 [序列总数] 例如128的有序数列最终步骤为log2 128 = 7
 * @author ll
 * @date 2020-09-02 11:34:11
 **/
public class BinarySearchMethod {
    public static void main(String[] args) {
        int[] myArr = new int[] {1, 2, 5, 12, 36, 45, 58, 98, 102};
        int target1 = 98;
        int target2 = 6;
        int result1 = binarySearch(myArr, target1);
        int result2 = binarySearch(myArr, target2);
        System.out.println(result1);
        System.out.println(result2);
    }

    private static int binarySearch(int[] myArr, int target) {
        int min = 0;
        int max = myArr.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            int midValue = myArr[mid];
            if (midValue == target) {
                return mid;
            } else if (midValue < target) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }
}
