package com.fei.design.pattern.action.memento;

/**
 * 发起者
 *
 * @Author Aning
 * @Date 2020/3/31 1:50 下午
 * @Version 1.0
 */
public class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento m) {
        this.setState(m.getState());
    }
}
