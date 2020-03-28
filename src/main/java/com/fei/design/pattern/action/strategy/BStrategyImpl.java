package com.fei.design.pattern.action.strategy;

/**
 * @Author Aning
 * @Date 2020/3/28 3:28 下午
 * @Version 1.0
 */
public class BStrategyImpl implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("B 策略被调用");
    }
}
