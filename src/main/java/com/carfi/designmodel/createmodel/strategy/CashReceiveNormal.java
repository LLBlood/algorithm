package com.carfi.designmodel.createmodel.strategy;

/**
 * com.carfi.designmodel.createmodel.strategy$
 *
 * @author ll
 * @date 2020-10-21 11:48:35
 **/
public class CashReceiveNormal extends CashReceive {

    @Override
    public double getResult(double money) {
        return money;
    }
}
