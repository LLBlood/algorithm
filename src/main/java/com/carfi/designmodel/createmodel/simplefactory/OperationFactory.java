package com.carfi.designmodel.createmodel.simplefactory;

/**
 * com.carfi.designmodel.createmodel.simplefactory$
 *
 * @author ll
 * @date 2020-10-12 16:02:57
 **/
public class OperationFactory {
    public static OperationFunction getOperationFunction(String operation) {
        OperationFunction operationFunction = null;
        try {
            switch (operation) {
                case "+" :
                    operationFunction = new OperationFunctionAdd();
                    break;
                case "-" :
                    operationFunction = new OperationFunctionSub();
                    break;
                case "*" :
                    operationFunction = new OperationFunctionMul();
                    break;
                case "/" :
                    operationFunction = new OperationFunctionDiv();
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return operationFunction;
    }
}
