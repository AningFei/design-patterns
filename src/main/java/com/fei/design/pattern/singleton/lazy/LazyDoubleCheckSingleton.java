package com.fei.design.pattern.singleton.lazy;

/**
 * 双重检查
 * 线程安全
 *
 *
 */
public class LazyDoubleCheckSingleton {
    //volatile解决指令重排序问题
    private static volatile LazyDoubleCheckSingleton lazyDoubleCheckSingleton;

    private LazyDoubleCheckSingleton() {
    }

    public  static LazyDoubleCheckSingleton getInstance() {
        //第一层检查 解决线程等待
        if (null == lazyDoubleCheckSingleton) {
            synchronized (LazyDoubleCheckSingleton.class){
                //第二层检查判断是否创建对象
                if (null == lazyDoubleCheckSingleton){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }

        }
        return lazyDoubleCheckSingleton;
    }
}
