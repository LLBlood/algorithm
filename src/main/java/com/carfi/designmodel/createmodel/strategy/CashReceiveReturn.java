package com.carfi.designmodel.createmodel.strategy;

/**
 * com.carfi.designmodel.createmodel.strategy$
 *
 * @author ll
 * @date 2020-10-21 11:48:42
 **/
public class CashReceiveReturn extends CashReceive {

    private double inputMoney;
    private double outPutMoney;

    public CashReceiveReturn() {}

    public CashReceiveReturn(double inputMoney, double outPutMoney) {
        this.inputMoney = inputMoney;
        this.outPutMoney = outPutMoney;
    }

    @Override
    public double getResult(double money) {
        return money - (money / inputMoney) * outPutMoney;
    }
}
