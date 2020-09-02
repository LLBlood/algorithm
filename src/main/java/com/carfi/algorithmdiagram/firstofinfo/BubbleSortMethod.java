package com.carfi.algorithmdiagram.firstofinfo;

/**
 * com.carfi.algorithmdiagram.firstofinfo$
 * 冒泡排序
 * 前一个数和后一个数替换
 * @author ll
 * @date 2020-09-02 14:05:33
 **/
public class BubbleSortMethod {
    public static void main(String[] args) {
        int[] arr = new int[] {3,23,45,21,2,12,5434,32};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
