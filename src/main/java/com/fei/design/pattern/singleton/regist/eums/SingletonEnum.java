package com.fei.design.pattern.singleton.regist.eums;

/**
 *  枚举为什么会单例 优雅
 *  java低层已经将枚举的反射排除在外 不能被反射破坏
 */
public enum SingletonEnum {

    INSTANCE;

    private Object data;

    public Object getObject() {
        return this.data;
    }

    public void setData(Object object) {
        this.data = object;
    }

    public static SingletonEnum getInstance() {

        return INSTANCE;
    }
}
