package com.carfi.designmodel.createmodel.simplefactory.algorithm.advanced;

/**
 * com.carfi.designmodel.createmodel.simplefactory.algorithm.advanced$
 * 计算乘法类
 * @author ll
 * @date 2020-08-27 14:30:58
 **/
public class OperatorMul extends OperatorFunction {
    @Override
    public int getResult() {
        return getNumberA() * getNumberB();
    }
}
