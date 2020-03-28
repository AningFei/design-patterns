package com.fei.design.pattern.action.template;

/**
 * @Author Aning
 * @Date 2020/3/28 5:32 下午
 * @Version 1.0
 */
public class TemplateTest {

    public static void main(String[] args) {

        BaseTemplate baseTemplate=new Caculate1();
        baseTemplate.getPrice();
        baseTemplate=new Caculate2();
        baseTemplate.getPrice();
    }
}
