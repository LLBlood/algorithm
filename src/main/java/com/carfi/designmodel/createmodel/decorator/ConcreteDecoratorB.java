package com.carfi.designmodel.createmodel.decorator;

/**
 * com.carfi.designmodel.createmodel.decorator$
 *
 * @author ll
 * @date 2020-10-21 14:11:02
 **/
public class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
        super.operation();
        System.out.println("穿上裤子");
    }
}
