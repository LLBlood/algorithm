package com.carfi.designmodel.createmodel.simplefactory;

/**
 * com.carfi.designmodel.createmodel.simplefactory$
 * 创建模式-简单工厂-披萨工厂
 * @author ll
 * @date 2020-08-20 14:58:09
 **/
public class SimplePizzaFactory {
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if ("cheese".equals(pizzaType)) {
            pizza = new CheesePizza();
        } else if ("greek".equals(pizzaType)) {
            pizza = new GreekPizza();
        } else if ("pepper".equals(pizzaType)) {
            pizza = new PepperPizza();
        }
        return pizza;
    }
}
