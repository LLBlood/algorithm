package com.carfi.algorithmdiagram.firstofinfo;

/**
 * com.carfi.algorithmdiagram.firstofinfo$
 * 选择排序
 * 每次排序选出最小的。并与当前位替换
 * @author ll
 * @date 2020-09-02 13:58:19
 **/
public class SelectSortMethod {
    public static void main(String[] args) {
        int[] arr = new int[] {3,23,45,21,2,12,5434,32};
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
