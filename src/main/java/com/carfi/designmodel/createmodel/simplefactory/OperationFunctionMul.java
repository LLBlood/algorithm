package com.carfi.designmodel.createmodel.simplefactory;

/**
 * com.carfi.designmodel.createmodel.simplefactory$
 *
 * @author ll
 * @date 2020-10-12 16:07:08
 **/
public class OperationFunctionMul implements OperationFunction {
    @Override
    public Double getResult(Double num1, Double num2) {
        return num1 * num2;
    }
}
