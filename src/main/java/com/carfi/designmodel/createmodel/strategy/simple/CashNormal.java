package com.carfi.designmodel.createmodel.strategy.simple;

/**
 * com.carfi.designmodel.createmodel.strategy.simple$
 *
 * @author ll
 * @date 2020-08-27 15:38:50
 **/
public class CashNormal extends CashFunction {
    @Override
    public double getResult(double price) {
        return price;
    }
}
