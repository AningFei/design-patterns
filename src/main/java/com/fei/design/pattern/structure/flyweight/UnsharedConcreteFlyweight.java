package com.fei.design.pattern.structure.flyweight;

/**
 * 非享元对象
 *
 * @Author Aning
 * @Date 2020/3/31 9:19 下午
 * @Version 1.0
 */
public class UnsharedConcreteFlyweight {
    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
