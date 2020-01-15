package com.carfi.math.simple;

/**
 * com.carfi.math$
 * 整数的各位积和之差
 * 输入：n = 234
 * 输出：15
 * 解释：
 * 各位数之积 = 2 * 3 * 4 = 24
 * 各位数之和 = 2 + 3 + 4 = 9
 * 结果 = 24 - 9 = 15
 * @author ll
 * @date 2020-01-15 13:09:40
 **/
public class IntegerDiffSum1281 {
    public int subtractProductAndSum(int n) {
        /**
         * 获取当前数据的每一位数，对10取商，对10取余
         */
        int diff = 1;
        int sum = 0;
        do {
            int yu = n % 10;
            diff = diff * yu;
            sum = sum + yu;
            n = n / 10;
        } while (n != 0);
        return diff - sum;
    }
}
