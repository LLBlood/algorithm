package com.carfi.math.simple.greedy;

/**
 * com.carfi.math.simple.greedy$
 * 122. 买卖股票的最佳时机 II
 *  贪心算法
 *      只要赚钱了就行
 *      输入: [7,1,5,3,6,4]
 * 输出: 7
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
 *      随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3
 * @author ll
 * @date 2020-08-21 09:09:05
 **/
public class BestTimeBuySellStock122 {
    public int maxProfit(int[] prices) {
        int maxPorfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i+1]) {
                maxPorfit += prices[i+1] - prices[i];
            }
        }
        return maxPorfit;
    }
}
