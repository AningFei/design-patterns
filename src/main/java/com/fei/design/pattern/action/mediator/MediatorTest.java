package com.fei.design.pattern.action.mediator;

/**
 * @Author Aning
 * @Date 2020/3/31 8:56 下午
 * @Version 1.0
 */
public class MediatorTest {


    public static void main(String[] args) {
        Mediator md=new ConcreteMediator();
        Colleague c1,c2;
        c1=new ConcreteColleague1();
        c2=new ConcreteColleague2();
        md.register(c1);
        md.register(c2);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }


}
