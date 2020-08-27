package com.carfi.designmodel.createmodel.strategy.simple;

/**
 * com.carfi.designmodel.createmodel.strategy.simple$
 *
 * @author ll
 * @date 2020-08-27 15:44:00
 **/
public class CashFactory {
    public static CashFunction createCashFunction(int select) {
        CashFunction cashFunction = null;
        switch (select) {
            case 1:
                cashFunction = new CashNormal();
                break;
            case 2:
                cashFunction = new CashRebate(0.8);
                break;
            case 3:
                cashFunction = new CashReturn(300, 100);
                break;
        }
        return cashFunction;
    }
}
