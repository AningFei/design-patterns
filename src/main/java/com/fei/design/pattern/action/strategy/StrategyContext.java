package com.fei.design.pattern.action.strategy;

/**
 * @Author Aning
 * @Date 2020/3/28 3:29 下午
 * @Version 1.0
 */
public class StrategyContext  {
    private  Strategy strategy;




    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod() {
        strategy.strategyMethod();

    }
}
