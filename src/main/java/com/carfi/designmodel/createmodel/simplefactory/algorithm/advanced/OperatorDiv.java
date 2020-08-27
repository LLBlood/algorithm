package com.carfi.designmodel.createmodel.simplefactory.algorithm.advanced;

/**
 * com.carfi.designmodel.createmodel.simplefactory.algorithm.advanced$
 * 计算除法类
 * @author ll
 * @date 2020-08-27 14:31:30
 **/
public class OperatorDiv extends OperatorFunction {

    @Override
    public int getResult() {
        return getNumberA() / getNumberB();
    }
}
