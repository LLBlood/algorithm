package com.carfi.designmodel.createmodel.strategy;

/**
 * com.carfi.designmodel.createmodel.strategy$
 *
 * @author ll
 * @date 2020-10-21 11:48:49
 **/
public class CashReceiveDiscount extends CashReceive {

    private Double percent;

    public CashReceiveDiscount() {}

    public CashReceiveDiscount(double percent) {
        this.percent = percent;
    }

    @Override
    public double getResult(double money) {
        return money * percent;
    }
}
