package com.carfi.math;

import java.util.Scanner;

/**
 * com.carfi.math$
 * 给一个整形数组中的数按从小到大连续编号，要求相同数字编号相同，编号从1开始，输出编号结果时按照原数组元素的顺序输出
 * 思路：
 *      1、如果某个数在整个数组中都找不到比它更小的数，那么该数排序结果就是1
 *      2、如果某个数在整个数组中中只有1个数比他小，那么该数排序结果就是2
 *      3、以此类推，某个数的编号排序结果，就是找这个数在整个数组中有多少个数比它小
 *      4、又因为相同的数编号排序结果一致，所以在找小数字个数时，要避免重复数字进行比较，也就是说：要专门记录比较过的数字，并且对这些数字进行去重判断
 * @author ll
 * @date 2019-12-21 09:46:34
 **/
public class IntNumIdent {
    public static void main(String[] args) {
        System.out.println("请输入一串数字");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        //将字符串转数组
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            int currentNum = Integer.parseInt(str[i]);
            //当前值编号初值值
            int count = 1;
            //创建一个整形数组，专门存储比较过了的值
            int[] numArr = new int[str.length];
            //比较过整形数组角标
            int index = -1;
            for (int j = 0; j < str.length; j++) {
                int compareNum = Integer.parseInt(str[j]);
                //如果比较值比当前值小，判断是否是重复值
                if (compareNum < currentNum) {
                    //判断当前比较的值，在整形数组是否存在，不存在添加
                    boolean flag = compareStrNum(numArr, compareNum, index);
                    if (flag) {
                        index++;
                        count++;
                    }
                }
            }
            System.out.print(count+"\t");
        }

    }

    private static boolean compareStrNum(int[] numArr, int currentNum, int index) {
        for (int i = 0; i <= index; i++) {
            if (numArr[i] == currentNum) {
                return false;
            }
        }
        numArr[index+1] = currentNum;
        return true;
    }

}
