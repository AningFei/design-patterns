package com.fei.design.pattern.action.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author Aning
 * @Date 2020/3/30 7:10 下午
 * @Version 1.0
 */
public class ConcreteAggregate implements  Aggregate {
    private List<Object> list=new ArrayList<Object>();
    @Override
    public void add(Object obj) {
        list.add(obj);

    }

    @Override
    public void remove(Object obj) {
    list.remove(obj);
    }

    @Override
    public IteratorCustomize getIterator() {

        return(new IteratorCustomizeImpl(list));

    }
}
