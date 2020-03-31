package com.fei.design.pattern.action.visitor;

/**
 *
 * 材料
 *
 * @Author Aning
 * @Date 2020/3/31 7:51 下午
 * @Version 1.0
 */
public interface Material {
    String accept(CompanyVisitor visitor);
}
