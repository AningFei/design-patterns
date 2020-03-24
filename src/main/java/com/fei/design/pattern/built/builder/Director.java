package com.fei.design.pattern.built.builder;

/**
 * @Author Aning
 * @Date 2020/3/24 2:33 下午
 * @Version 1.0
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //产品构建与组装方法
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
