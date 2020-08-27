package com.carfi.designmodel.createmodel.strategy.simple;

import java.util.Scanner;

/**
 * com.carfi.designmodel.createmodel.strategy.simple$
 *
 * @author ll
 * @date 2020-08-27 15:31:14
 **/
public class CashSimple {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入收费金额：");
            double price = scanner.nextDouble();
            System.out.println("请选择收费模式：1.正常， 2.折扣-8折， 3.返利-满300返100");
            int select = scanner.nextInt();
            double result = CashFactory.createCashFunction(select).getResult(price);
            System.out.println("最终结果："+result);
        } catch (Exception e) {
            System.out.println("请输入正确的数字");
        }
    }
}
