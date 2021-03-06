package com.carfi.designmodel.createmodel.templatemode;

/**
 * com.carfi.designmodel.createmodel.templatemode$
 *
 * @author ll
 * @date 2020-11-13 15:18:25
 **/
public abstract class ModelPaper {
    public void testQuestion1() {
        System.out.println("英雄联盟暴击装备：A、无尽之刃  B、饮血剑");
        System.out.println(answer1());
    }

    public void testQuestion2() {
        System.out.println("英雄联盟移速装备：A、攻速鞋  B、疾跑");
        System.out.println(answer2());
    }

    public void testQuestion3() {
        System.out.println("英雄联盟冷却装备：A、大天使  B、恶魔法典");
        System.out.println(answer3());
    }

    public abstract String answer1();
    public abstract String answer2();
    public abstract String answer3();
}
