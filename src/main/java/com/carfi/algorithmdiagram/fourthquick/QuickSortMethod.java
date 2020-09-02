package com.carfi.algorithmdiagram.fourthquick;

/**
 * com.carfi.algorithmdiagram.fourthquick$
 * 快速排序，选基准值，双索引，索引不可越过基准值索引
 * @author ll
 * @date 2020-09-02 14:34:04
 **/
public class QuickSortMethod {
    public static void main(String[] args) {
        int[] arr = new int[] {3,23,45,21,2,12,5434,32};
        int left = 0;
        int right = arr.length - 1;
        quickSort(arr, left, right);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void quickSort(int[] arr, int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex) {
            return;
        }
        //待排序的第一个元素作为基准值
        int key = arr[leftIndex];
        int left = leftIndex;
        int right = rightIndex;
        //从左右两边交替扫描，直到left = right
        while (left < right) {
            while (left < right && arr[right] >= key) {
                //从右往左扫描，找到第一个比基准值小的元素
                right--;
            }
            //找到这种元素将arr[right]放入arr[left]中
            arr[left] = arr[right];
            while (left < right && arr[left] <= key) {
                //从左往右扫描，找到第一个比基准值大的元素
                left++;
            }
            //找到这种元素将arr[left]放入arr[right]中
            arr[right] = arr[left];
        }
        //此时left角标==right角标，基准值归位
        arr[left] = key;
        //对基准值左边的元素进行递归排序
        quickSort(arr, leftIndex, left - 1);
        //对基准值右边的元素进行递归排序。
        quickSort(arr, right + 1, rightIndex);
    }
}
