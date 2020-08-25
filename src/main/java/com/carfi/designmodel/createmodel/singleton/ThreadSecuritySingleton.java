package com.carfi.designmodel.createmodel.singleton;

/**
 * com.carfi.designmodel.createmodel.singleton$
 * 线程安全懒加载
 * @author ll
 * @date 2020-08-21 15:54:58
 **/
public class ThreadSecuritySingleton {
    /**
     * volatile保证对象实例化的原子性
     */
    private static volatile ThreadSecuritySingleton instance;
    private ThreadSecuritySingleton() {};
    public static ThreadSecuritySingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSecuritySingleton.class) {
                if (instance == null) {
                    return new ThreadSecuritySingleton();
                }
            }
        }
        return instance;
    }
}
