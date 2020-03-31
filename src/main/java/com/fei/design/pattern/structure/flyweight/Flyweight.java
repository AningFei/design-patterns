package com.fei.design.pattern.structure.flyweight;

/**
 * 抽象享元
 *
 * @Author Aning
 * @Date 2020/3/31 9:20 下午
 * @Version 1.0
 */
public interface Flyweight {
   void  operation(UnsharedConcreteFlyweight state);
}
