package com.fei.design.pattern.built.builder;

/**
 * @Author Aning
 * @Date 2020/3/24 2:29 下午
 * @Version 1.0
 */
public abstract class Builder {


    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    //返回产品对象
    public Product getResult() {

        return product;
    }
}
