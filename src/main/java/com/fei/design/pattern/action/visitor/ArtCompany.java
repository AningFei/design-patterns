package com.fei.design.pattern.action.visitor;

/**
 * @Author Aning
 * @Date 2020/3/31 7:54 下午
 * @Version 1.0
 */
public class ArtCompany implements  CompanyVisitor {
    @Override
    public String create(Paper element) {
        return "讲学图";
    }

    @Override
    public String create(Cuprum element) {
        return "人铜像";
    }
}
