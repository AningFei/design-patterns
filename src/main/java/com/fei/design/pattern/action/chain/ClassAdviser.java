package com.fei.design.pattern.action.chain;

/**
 * @Author Aning
 * @Date 2020/3/30 9:51 下午
 * @Version 1.0
 */
public class ClassAdviser extends Leader {
    @Override
    public void handleRequest(int LeaveDays) {
        if (LeaveDays <= 2) {
            System.out.println("班主任批准您请假" + LeaveDays + "天。");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(LeaveDays);
            } else {
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}
