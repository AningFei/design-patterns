package com.fei.design.pattern.built.singleton.threadlocal;

/**
 *  线程内部单例 线程之间不单例
 */
public class ThreadLocalSingleton {

    private  static  ThreadLocal<ThreadLocalSingleton> threadLocalSingletonThreadLocal=new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public ThreadLocalSingleton() {
    }
    public static ThreadLocalSingleton getInstance(){
        return  threadLocalSingletonThreadLocal.get();
    }
}
