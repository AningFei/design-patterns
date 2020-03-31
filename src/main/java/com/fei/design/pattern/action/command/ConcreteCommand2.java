package com.fei.design.pattern.action.command;

/**
 * @Author Aning
 * @Date 2020/3/31 10:09 上午
 * @Version 1.0
 */
public class ConcreteCommand2 implements AbstractCommand {

    private CompositeReceiver receiver;

    public ConcreteCommand2() {
        receiver = new CompositeReceiver();
    }

    @Override
    public void execute() {
        receiver.action2();
    }


}
