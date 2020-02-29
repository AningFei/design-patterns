package com.fei.design.pattern.singleton.lazy;

/**
 * 线程不安全
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton simpleSingleton;

    private LazySimpleSingleton() {
    }

    public static LazySimpleSingleton getInstance() {
        if (null == simpleSingleton) {
            simpleSingleton = new LazySimpleSingleton();
        }
        return simpleSingleton;
    }
}
