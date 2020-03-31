package com.fei.design.pattern.action.memento;

/**
 * 备忘录
 * @Author Aning
 * @Date 2020/3/31 1:48 下午
 * @Version 1.0
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
