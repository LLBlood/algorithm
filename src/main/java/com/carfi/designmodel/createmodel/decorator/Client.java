package com.carfi.designmodel.createmodel.decorator;

/**
 * com.carfi.designmodel.createmodel.decorator$
 *
 * @author ll
 * @date 2020-10-21 14:13:00
 **/
public class Client {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();
        ConcreteDecoratorC concreteDecoratorC = new ConcreteDecoratorC();
        concreteDecoratorA.setComponent(concreteComponent);
        concreteDecoratorB.setComponent(concreteDecoratorA);
        concreteDecoratorC.setComponent(concreteDecoratorB);
        concreteDecoratorC.operation();
    }
}
