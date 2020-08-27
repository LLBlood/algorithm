package com.carfi.designmodel.createmodel.simplefactory.algorithm.advanced;

/**
 * com.carfi.designmodel.createmodel.simplefactory.algorithm.advanced$
 *
 * @author ll
 * @date 2020-08-27 14:30:19
 **/
public class OperatorSub extends OperatorFunction {

    @Override
    public int getResult() {
        return getNumberA() - getNumberB();
    }
}
