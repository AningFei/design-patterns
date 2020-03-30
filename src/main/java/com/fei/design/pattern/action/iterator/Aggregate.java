package com.fei.design.pattern.action.iterator;

import java.util.Iterator;

/**
 * @Author Aning
 * @Date 2020/3/30 7:09 下午
 * @Version 1.0
 */
public interface Aggregate {


     void add(Object obj);

     void remove(Object obj);

     IteratorCustomize getIterator();
}
