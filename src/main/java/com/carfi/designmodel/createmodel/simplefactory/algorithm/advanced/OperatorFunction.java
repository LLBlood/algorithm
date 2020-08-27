package com.carfi.designmodel.createmodel.simplefactory.algorithm.advanced;

/**
 * com.carfi.designmodel.createmodel.simplefactory.algorithm.advanced$
 * 计算功能父类
 * @author ll
 * @date 2020-08-27 14:24:03
 **/
public abstract class OperatorFunction {
    private int numberA;
    private int numberB;

    public int getNumberA() {
        return numberA;
    }

    public void setNumberA(int numberA) {
        this.numberA = numberA;
    }

    public int getNumberB() {
        return numberB;
    }

    public void setNumberB(int numberB) {
        this.numberB = numberB;
    }

    //获取计算结果
    public abstract int getResult();
}
