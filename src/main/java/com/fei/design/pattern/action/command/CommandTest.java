package com.fei.design.pattern.action.command;

/**
 * @Author Aning
 * @Date 2020/3/31 10:13 上午
 * @Version 1.0
 */
public class CommandTest {
    public static void main(String[] args) {

        AbstractCommand cmd1=new ConcreteCommand1();
        AbstractCommand cmd2=new ConcreteCommand2();
        CompositeInvoker ir=new CompositeInvoker();
        ir.add(cmd1);
        ir.add(cmd2);
        System.out.println("客户访问调用者的execute()方法...");
        ir.execute();
    }
}
