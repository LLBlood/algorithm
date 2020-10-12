package com.carfi.designmodel.createmodel.simplefactory;

/**
 * com.carfi.designmodel.createmodel.simplefactory$
 *
 * @author ll
 * @date 2020-10-12 16:06:31
 **/
public class OperationFunctionSub implements OperationFunction {
    @Override
    public Double getResult(Double num1, Double num2) {
        return num1 - num2;
    }
}
