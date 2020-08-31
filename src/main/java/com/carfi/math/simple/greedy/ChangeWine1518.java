package com.carfi.math.simple.greedy;

/**
 * com.carfi.math.simple.greedy$
 *
 * @author ll
 * @date 2020-08-31 14:43:42
 **/
public class ChangeWine1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = numBottles;
        int emptyBottles = numBottles;
        while (emptyBottles >= numExchange) {
            numBottles = emptyBottles / numExchange;
            emptyBottles = emptyBottles % numExchange;
            emptyBottles += numBottles;
            count += numBottles;
        }
        return count;
    }

    public static void main(String[] args) {
        int i = new ChangeWine1518().numWaterBottles(15, 4);
        System.out.println(i);
    }
}
