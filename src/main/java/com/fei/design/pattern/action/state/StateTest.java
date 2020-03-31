package com.fei.design.pattern.action.state;

/**
 * @Author Aning
 * @Date 2020/3/31 2:30 下午
 * @Version 1.0
 */
public class StateTest {

    public static void main(String[] args) {
        ScoreContext account=new ScoreContext();
        System.out.println("学生成绩状态测试：");
        account.add(30);
        account.add(40);
        account.add(25);
        account.add(-15);
        account.add(-25);

    }
}
