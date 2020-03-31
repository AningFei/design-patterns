package com.fei.design.pattern.action.command;

import java.util.ArrayList;

/**
 * @Author Aning
 * @Date 2020/3/31 10:11 上午
 * @Version 1.0
 */
public class CompositeInvoker implements AbstractCommand {

    private ArrayList<AbstractCommand> children = new ArrayList<AbstractCommand>();

    public void add(AbstractCommand c) {
        children.add(c);
    }

    public void remove(AbstractCommand c) {
        children.remove(c);
    }

    public AbstractCommand getChild(int i) {
        return children.get(i);
    }

    @Override
    public void execute() {
        for (AbstractCommand obj : children) {
            obj.execute();
        }
    }
}
