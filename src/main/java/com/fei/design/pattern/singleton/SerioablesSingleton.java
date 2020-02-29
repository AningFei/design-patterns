package com.fei.design.pattern.singleton;

import com.fei.design.pattern.singleton.lazy.LazySimpleSingleton;

import java.io.Serializable;

/**
 * 序列化 会破坏单例 只需要写这个方法就好readResolve
 * 使用的是桥接模式
 */
public class SerioablesSingleton  implements Serializable {
    //
    private final static SerioablesSingleton  INSTANCE=new SerioablesSingleton();

    private SerioablesSingleton() {
    }

    public static SerioablesSingleton getInstance() {

        return INSTANCE;
    }

    private  Object readResolve(){
        return INSTANCE;
    }
}
