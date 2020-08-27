package com.carfi.designmodel.createmodel.simplefactory.algorithm.advanced;

import java.util.Scanner;

/**
 * com.carfi.designmodel.createmodel.simplefactory.algorithm.advanced$
 *
 * @author ll
 * @date 2020-08-27 14:20:45
 **/
public class AlgorithmAdvanced {
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
            OperatorFunction operator = OperatorFactory.createOperator(symbol);
            operator.setNumberA(numOne);
            operator.setNumberB(numTwo);
            result = operator.getResult();
            System.out.println("最终结果为："+result);
        } catch (Exception e) {
            System.out.println("请输入正确的计算数字");
        }
    }
}
