package com.carfi.designmodel.createmodel.factorymethod;

/**
 * com.carfi.designmodel.createmodel.factorymethod$
 *
 * @author ll
 * @date 2020-11-13 14:39:13
 **/
public class FactoryDiv implements IFactory {
    @Override
    public IOperation createOperation() {
        return new OperationDiv();
    }
}
