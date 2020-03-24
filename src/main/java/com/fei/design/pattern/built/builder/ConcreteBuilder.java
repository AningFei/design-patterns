package com.fei.design.pattern.built.builder;

/**
 * @Author Aning
 * @Date 2020/3/24 2:31 下午
 * @Version 1.0
 */
public class ConcreteBuilder extends  Builder {
    @Override
    public void buildPartA() {
        product.setPartA("建造 PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造 PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造 PartC");
    }
}
