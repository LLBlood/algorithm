package com.carfi.designmodel.createmodel.proxy;

/**
 * com.carfi.designmodel.createmodel.proxy$
 *
 * @author ll
 * @date 2020-10-21 16:04:11
 **/
public class Persuit implements GiveGift {

    private SchoolGirl mm;

    public Persuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.getName() + "送你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName() + "送你鲜花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName() + "送你巧克力");
    }
}
