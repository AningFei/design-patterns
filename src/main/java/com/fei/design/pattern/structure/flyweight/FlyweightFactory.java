package com.fei.design.pattern.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Aning
 * @Date 2020/3/31 9:24 下午
 * @Version 1.0
 */
public class FlyweightFactory {

    private Map<String, Flyweight> flyweights=new HashMap<String, Flyweight>();
    public Flyweight getFlyweight(String key)
    {
        Flyweight flyweight=flyweights.get(key);
        if(flyweight!=null) {
            System.out.println("具体享元"+key+"已经存在，被成功获取！");
        } else {
            flyweight=new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}
