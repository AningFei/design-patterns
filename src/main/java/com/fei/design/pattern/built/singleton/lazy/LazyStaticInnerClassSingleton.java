package com.fei.design.pattern.built.singleton.lazy;

public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton lazyStaticInnerClassSingleton;

    private LazyStaticInnerClassSingleton() {
    }

    public static LazyStaticInnerClassSingleton getInstance() {
        return LazyLoader.LAZY_INSTANCE;
    }

    private static class LazyLoader {

        private static final LazyStaticInnerClassSingleton LAZY_INSTANCE =
                new LazyStaticInnerClassSingleton();
    }
}
