package com.carfi.math.simple.sort;

import java.util.Arrays;

/**
 * com.carfi.math.simple.sort$
 * 1491. 去掉最低工资和最高工资后的工资平均值
 * @author ll
 * @date 2020-09-30 14:32:58
 **/
public class AvgSalary1491 {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int sum = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
        }
        return sum * 1.0 / (salary.length - 2);
    }

    public static void main(String[] args) {
        int[] ints = {4000, 3000, 1000, 2000};
        double average = new AvgSalary1491().average(ints);
        System.out.println(average);
    }
}
