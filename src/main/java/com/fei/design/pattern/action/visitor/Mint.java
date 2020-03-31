package com.fei.design.pattern.action.visitor;

/**
 * @Author Aning
 * @Date 2020/3/31 7:55 下午
 * @Version 1.0
 */
public class Mint implements  CompanyVisitor {
    @Override
    public String create(Paper element) {
        return "人民币";
    }

    @Override
    public String create(Cuprum element) {
        return "铜币";
    }
}
