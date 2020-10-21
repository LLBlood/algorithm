package com.carfi.designmodel.createmodel.proxy;

/**
 * com.carfi.designmodel.createmodel.proxy$
 *
 * @author ll
 * @date 2020-10-21 16:05:42
 **/
public class Proxy implements GiveGift {

    private Persuit persuit;

    public Proxy() {
    }

    public Proxy(SchoolGirl mm) {
        this.persuit = new Persuit(mm);
    }

    @Override
    public void giveDolls() {
        persuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        persuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        persuit.giveChocolate();
    }
}
