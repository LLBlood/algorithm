package com.carfi.designmodel.createmodel.simplefactory.algorithm.advanced;

/**
 * com.carfi.designmodel.createmodel.simplefactory.algorithm.advanced$
 * 计算加法类
 * @author ll
 * @date 2020-08-27 14:29:32
 **/
public class OperatorAdd extends OperatorFunction {
    @Override
    public int getResult() {
        return getNumberA() + getNumberB();
    }
}
