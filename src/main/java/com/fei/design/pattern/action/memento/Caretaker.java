package com.fei.design.pattern.action.memento;

/**
 * 管理者
 *
 * @Author Aning
 * @Date 2020/3/31 1:51 下午
 * @Version 1.0
 */
public class Caretaker {

    private Memento memento;

    public void setMemento(Memento m) {
        memento = m;
    }

    public Memento getMemento() {
        return memento;
    }
}
