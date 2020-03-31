package com.fei.design.pattern.action.mediator;

/**
 * @Author Aning
 * @Date 2020/3/31 8:50 下午
 * @Version 1.0
 */
public abstract class Colleague {
    protected Mediator mediator;

    public void setMedium(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();

    public abstract void send();
}
