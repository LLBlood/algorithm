package com.carfi.designmodel.createmodel.strategy;

import java.util.Scanner;

/**
 * com.carfi.designmodel.createmodel.strategy$
 *
 * @author ll
 * @date 2020-10-21 11:47:46
 **/
public class ShopReceiveDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎使用商场收费山寨版");
        System.out.println("请输入最终金额");
        double money = sc.nextDouble();
        System.out.println("请选择收费规则：1.正常收费，2.满300减去100，3.打8折");
        int select = sc.nextInt();
        ShopReceiveContext shopReceiveContext = new ShopReceiveContext(select);
        double result = shopReceiveContext.getResult(money);
        System.out.println("最终结果：" + result);
    }
}
