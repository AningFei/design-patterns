package com.fei.design.pattern.action.chain;

/**
 * @Author Aning
 * @Date 2020/3/31 9:20 上午
 * @Version 1.0
 */
public class Dean extends Leader {
    @Override
    public void handleRequest(int LeaveDays) {
        if (LeaveDays <= 10) {
            System.out.println("院长批准您请假" + LeaveDays + "天。");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(LeaveDays);
            } else {
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}
