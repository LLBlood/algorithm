package com.carfi.designmodel.createmodel.strategy.advanced;

import com.carfi.designmodel.createmodel.strategy.simple.CashFunction;
import com.carfi.designmodel.createmodel.strategy.simple.CashNormal;
import com.carfi.designmodel.createmodel.strategy.simple.CashRebate;
import com.carfi.designmodel.createmodel.strategy.simple.CashReturn;

/**
 * com.carfi.designmodel.createmodel.strategy.advanced$
 * 策略模式上下文
 * @author ll
 * @date 2020-08-27 16:03:10
 **/
public class StrategyContext {
    private CashFunction cashFunction;

    public StrategyContext(int select) {
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
    }

    public double getResult(double price) {
        return cashFunction.getResult(price);
    }
}
