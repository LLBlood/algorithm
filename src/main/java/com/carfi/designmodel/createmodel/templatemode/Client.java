package com.carfi.designmodel.createmodel.templatemode;

/**
 * com.carfi.designmodel.createmodel.templatemode$
 *
 * @author ll
 * @date 2020-11-13 15:17:15
 **/
public class Client {
    public static void main(String[] args) {
        OriTestPaperA oriTestPaperA = new OriTestPaperA();
        oriTestPaperA.testQuestion1();
        oriTestPaperA.testQuestion2();
        oriTestPaperA.testQuestion3();

        OriTestPaperB oriTestPaperB = new OriTestPaperB();
        oriTestPaperB.testQuestion1();
        oriTestPaperB.testQuestion2();
        oriTestPaperB.testQuestion3();

        ModelPaper modelPaperA = new ModelPaperA();
        modelPaperA.testQuestion1();
        modelPaperA.testQuestion2();
        modelPaperA.testQuestion3();
        ModelPaper modelPaperB = new ModelPaperB();
        modelPaperB.testQuestion1();
        modelPaperB.testQuestion2();
        modelPaperB.testQuestion3();
    }
}
