package com.fei.design.pattern.action.visitor;

/**
 * @Author Aning
 * @Date 2020/3/31 7:49 下午
 * @Version 1.0
 */
public interface CompanyVisitor {

    String create(Paper element);

    String create(Cuprum element);

}
