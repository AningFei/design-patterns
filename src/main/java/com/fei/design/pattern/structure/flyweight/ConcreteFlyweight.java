package com.fei.design.pattern.structure.flyweight;

/**
 * @Author Aning
 * @Date 2020/3/31 9:21 下午
 * @Version 1.0
 */
public class ConcreteFlyweight implements  Flyweight {

    private String key;
    ConcreteFlyweight(String key)
    {
        this.key=key;
        System.out.println("具体享元"+key+"被创建！");
    }
    @Override
    public void operation(UnsharedConcreteFlyweight state) {
        System.out.print("具体享元"+key+"被调用，");
        System.out.println("非享元信息是:"+state.getInfo());
    }
}
