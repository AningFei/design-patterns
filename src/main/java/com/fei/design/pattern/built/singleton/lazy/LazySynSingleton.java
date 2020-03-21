package com.fei.design.pattern.built.singleton.lazy;

/**
 * 线程安全
 * synchronized 修饰静态方法  给类加锁
 * 如果调用类内其他方法 也是同步方法了
 * 线程会等待 浪费资源
 */
public class LazySynSingleton {

    private static LazySynSingleton lazySynSingleton;

    private LazySynSingleton() {
    }

    public synchronized static LazySynSingleton getInstance() {
        if (null == lazySynSingleton) {
            lazySynSingleton = new LazySynSingleton();
        }
        return lazySynSingleton;
    }
}
