package com.carfi.designmodel.createmodel.simplefactory;

import java.util.Scanner;

/**
 * com.carfi.designmodel.createmodel.simplefactory$
 *
 * @author ll
 * @date 2020-10-12 15:34:13
 **/
public class FourOperationsSimple {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("欢迎使用简陋四则运算计算器");
            System.out.println("请输入运算模式： + - * /");
            String operation = scanner.next();
            System.out.println("请输入数字1：");
            double num1 = scanner.nextDouble();
            System.out.println("请输入数字2：");
            double num2 = scanner.nextDouble();
            Double result = null;
            switch (operation) {
                case "+" :
                    result = num1 + num2;
                    break;
                case "-" :
                    result = num1 - num2;
                    break;
                case "*" :
                    result = num1 * num2;
                    break;
                case "/" :
                    result = num1 / num2;
                    break;
            }
            System.out.println("最终结果为：" + result);
        } catch (Exception e) {
            System.out.println("数据异常");
        }
    }
}
