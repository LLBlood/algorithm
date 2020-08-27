package com.carfi.designmodel.createmodel.simplefactory.algorithm.primary;

import java.util.Scanner;

/**
 * com.carfi.designmodel.createmodel.simplefactory.algorithm.primary$
 *
 * @author ll
 * @date 2020-08-27 14:09:41
 **/
public class AlgorithmPrimaty {
    public static void main(String[] args) {
        try {
            int result = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入第一个数字");
            int numOne = scanner.nextInt();
            System.out.println("请输入第二个数字");
            int numTwo = scanner.nextInt();
            System.out.println("请输入计算方法");
            String symbol = scanner.next();
            switch (symbol) {
                case "+":
                    result = numOne + numTwo;
                    break;
                case "-":
                    result = numOne - numTwo;
                    break;
                case "*":
                    result = numOne * numTwo;
                    break;
                case "/":
                    result = numOne / numTwo;
                    break;
            }
            System.out.println("最终结果为："+result);
        } catch (Exception e) {
            System.out.println("请输入正确的计算数字");
        }
    }
}
