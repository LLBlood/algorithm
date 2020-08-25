package com.carfi.designmodel.createmodel.singleton;

/**
 * com.carfi.designmodel.createmodel.singleton$
 * 懒加载
 * @author ll
 * @date 2020-08-21 15:52:15
 **/
public class LazySingleton {
    private static LazySingleton lazySingleton;
    private LazySingleton() {};

    public static LazySingleton getInstance() {
        if(lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
