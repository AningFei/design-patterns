package com.fei.design.pattern.action.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author Aning
 * @Date 2020/3/31 8:15 下午
 * @Version 1.0
 */
public class SetMaterial {

    private List<Material> list = new ArrayList<Material>();

    public String accept(CompanyVisitor visitor) {
        Iterator<Material> i = list.iterator();
        String tmp = "";
        while (i.hasNext()) {
            tmp += ((Material) i.next()).accept(visitor) + " ";
        }
        return tmp; //返回某公司的作品集
    }

    public void add(Material element) {
        list.add(element);
    }

    public void remove(Material element) {
        list.remove(element);
    }
}
