package com.carfi.designmodel.createmodel.factorymethod;

/**
 * com.carfi.designmodel.createmodel.factorymethod$
 *
 * @author ll
 * @date 2020-11-13 14:39:32
 **/
public class OperationDiv extends IOperation {
    @Override
    public Integer getResult() {
        return numberA / numberB;
    }
}
