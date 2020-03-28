package com.fei.design.pattern.action.strategy;

/**
 * @Author Aning
 * @Date 2020/3/28 3:57 下午
 * @Version 1.0
 */
public class StrategyTest {
    public static void main(String[] args)
    {
        StrategyContext c=new StrategyContext();
        Strategy s=new AStrategyImpl();
        c.setStrategy(s);
        c.strategyMethod();
        System.out.println("-----------------");
        s=new BStrategyImpl();
        c.setStrategy(s);
        c.strategyMethod();
    }
}
