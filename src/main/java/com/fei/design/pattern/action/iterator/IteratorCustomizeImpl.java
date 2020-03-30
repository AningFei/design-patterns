package com.fei.design.pattern.action.iterator;

import java.util.List;

/**
 * @Author Aning
 * @Date 2020/3/30 7:14 下午
 * @Version 1.0
 */
public class IteratorCustomizeImpl implements IteratorCustomize {
    private List<Object> list = null;
    private int index = -1;

    public IteratorCustomizeImpl(List<Object> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size() - 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object first() {
        index = 0;
        Object obj = list.get(index);
        return obj;
    }

    @Override
    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = list.get(++index);
        }
        return obj;
    }
}
