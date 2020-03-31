package com.fei.design.pattern.action.mediator;

/**
 * @Author Aning
 * @Date 2020/3/31 8:54 下午
 * @Version 1.0
 */
public class ConcreteColleague2 extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类2收到请求。");
    }

    /**
     * 请中介者转发
     */
    @Override
    public void send() {
        System.out.println("具体同事类2发出请求。");
        mediator.relay(this);
    }
}
