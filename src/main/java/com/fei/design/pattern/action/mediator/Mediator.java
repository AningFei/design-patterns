package com.fei.design.pattern.action.mediator;

/**
 * @Author Aning
 * @Date 2020/3/31 8:49 下午
 * @Version 1.0
 */
public interface Mediator {

    void register(Colleague colleague);

    /**
     * 转发
     * @param cl
     */
    void relay(Colleague cl);
}
