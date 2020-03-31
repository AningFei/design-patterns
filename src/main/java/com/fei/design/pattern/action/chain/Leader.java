package com.fei.design.pattern.action.chain;

/**
 * @Author Aning
 * @Date 2020/3/30 9:19 下午
 * @Version 1.0
 */
public abstract class Leader {
    private Leader next;

    public void setNext(Leader next) {
        this.next = next;
    }

    public Leader getNext() {
        return next;
    }

    public abstract void handleRequest(int LeaveDays);
}
