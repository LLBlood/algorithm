package com.carfi.designmodel.createmodel.factorymethod;

/**
 * com.carfi.designmodel.createmodel.factorymethod$
 *
 * @author ll
 * @date 2020-11-13 14:41:45
 **/
public class Client {
    public static void main(String[] args) {
        IFactory iFactory = new FactoryDiv();
        IOperation operation = iFactory.createOperation();
        operation.numberA = 1;
        operation.numberB = 1;
        Integer result = operation.getResult();
        System.out.println(result);
    }
}
