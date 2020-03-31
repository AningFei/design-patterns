package com.fei.design.pattern.action.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Aning
 * @Date 2020/3/31 8:52 下午
 * @Version 1.0
 */
public class ConcreteMediator implements Mediator {
    private List<Colleague> colleagues = new ArrayList<Colleague>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMedium(this);
        }
    }

    @Override
    public void relay(Colleague cl) {
        for (Colleague ob : colleagues) {
            if (!ob.equals(cl)) {
                ob.receive();
            }
        }
    }
}
