package com.carfi.designmodel.createmodel.singleton;

/**
 * com.carfi.designmodel.createmodel.singleton$
 * 单例模式 预加载
 * @author ll
 * @date 2020-08-21 15:48:17
 **/
public class PreloadSingleton {
    public static PreloadSingleton instance = new PreloadSingleton();

    /**
     * 构造函数私有化，避免外界new运行
     */
    private PreloadSingleton(){};

    public static PreloadSingleton getInstance() {
        return instance;
    }
}
