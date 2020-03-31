package com.fei.design.pattern.action.chain;

/**
 * @Author Aning
 * @Date 2020/3/31 9:21 上午
 * @Version 1.0
 */
public class ChainTest {
    public static void main(String[] args) {
        //组装责任链
        Leader teacher1=new ClassAdviser();
        Leader teacher2=new DepartmentHead();
        Leader teacher3=new Dean();

        teacher1.setNext(teacher2);
        teacher2.setNext(teacher3);
        //teacher3.setNext(teacher4);
        //提交请求
        teacher1.handleRequest(8);
    }
}
