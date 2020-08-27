package com.carfi.designmodel.createmodel.strategy.simple;

/**
 * com.carfi.designmodel.createmodel.strategy.simple$
 *
 * @author ll
 * @date 2020-08-27 15:42:17
 **/
public class CashReturn extends CashFunction {
    private double money;
    private double returnPrice;

    public CashReturn(double money, double returnPrice) {
        this.money = money;
        this.returnPrice = returnPrice;
    }

    @Override
    public double getResult(double price) {
        System.out.println(price);
        if (price < money) {
            return price;
        }
        return price - (price / money) * returnPrice;
    }
}
