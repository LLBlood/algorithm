package com.carfi.designmodel.createmodel.proxy;

/**
 * com.carfi.designmodel.createmodel.proxy$
 *
 * @author ll
 * @date 2020-10-21 16:06:22
 **/
public class Client {
    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl();
        schoolGirl.setName("jiaojiao");
        Proxy proxy = new Proxy(schoolGirl);
        proxy.giveChocolate();
        proxy.giveFlowers();
        proxy.giveDolls();
    }
}
