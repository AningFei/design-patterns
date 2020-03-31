package com.fei.design.pattern.action.visitor;

/**
 * @Author Aning
 * @Date 2020/3/31 7:53 下午
 * @Version 1.0
 */
public class Cuprum implements  Material{
    @Override
    public String accept(CompanyVisitor visitor) {
        return visitor.create(this);
    }
}
