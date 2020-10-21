package com.carfi.designmodel.createmodel.strategy;

import java.util.Scanner;

/**
 * com.carfi.designmodel.createmodel.strategy$
 * 商场收费规则
 * 正常收费，打8折，满300减100
 *  优点：想写啥就写啥
 *  缺点：代码会非常冗余
 * @author ll
 * @date 2020-10-21 11:00:01
 **/
public class ShopReceiveSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎使用商场收费山寨版");
        System.out.println("请输入最终金额");
        double money = sc.nextDouble();
        System.out.println("请选择收费规则：1.正常收费，2.满300减去100，3.打8折");
        int select = sc.nextInt();
        double result = 0d;
        switch (select) {
            case 1:
                result = money;
                break;
            case 2:
                result = money - (money / 300) * 100;
                break;
            case 3:
                result = result * 0.8;
                break;
        }
        System.out.println("最终结果：" + result);
    }
}
