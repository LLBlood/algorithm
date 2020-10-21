package com.carfi.designmodel.createmodel.strategy;

/**
 * com.carfi.designmodel.createmodel.strategy$
 *
 * @author ll
 * @date 2020-10-21 11:48:00
 **/
public class ShopReceiveContext {
    private CashReceive cashReceive;

    public ShopReceiveContext(int select) {
        switch (select) {
            case 1:
                cashReceive = new CashReceiveNormal();
                break;
            case 2:
                cashReceive = new CashReceiveReturn(300, 100);
                break;
            case 3:
                cashReceive = new CashReceiveDiscount(0.8);
                break;
        }
    }

    public double getResult(double money) {
        return cashReceive.getResult(money);
    }
}
