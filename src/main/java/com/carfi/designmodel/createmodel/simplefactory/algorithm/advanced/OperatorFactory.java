package com.carfi.designmodel.createmodel.simplefactory.algorithm.advanced;

/**
 * com.carfi.designmodel.createmodel.simplefactory.algorithm.advanced$
 * 计算工厂
 * @author ll
 * @date 2020-08-27 14:32:03
 **/
public class OperatorFactory {
    public static OperatorFunction createOperator(String symbol) {
        OperatorFunction operatorFunction = null;
        switch (symbol) {
            case "+":
                operatorFunction = new OperatorAdd();
                break;
            case "-":
                operatorFunction = new OperatorSub();
                break;
            case "*":
                operatorFunction = new OperatorMul();
                break;
            case "/":
                operatorFunction = new OperatorDiv();
                break;
        }
        return operatorFunction;
    }
}
