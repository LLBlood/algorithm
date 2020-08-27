package com.carfi.designmodel.createmodel.strategy.simple;

/**
 * com.carfi.designmodel.createmodel.strategy.simple$
 *
 * @author ll
 * @date 2020-08-27 15:40:11
 **/
public class CashRebate extends CashFunction {
    private double rebate;
    public CashRebate(double rebate) {
        this.rebate = rebate;
    }
    @Override
    public double getResult(double price) {
        return price * rebate;
    }
}
