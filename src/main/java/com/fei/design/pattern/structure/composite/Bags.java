package com.fei.design.pattern.structure.composite;

import java.util.ArrayList;

/**
 * @Author Aning
 * @Date 2020/3/28 2:33 下午
 * @Version 1.0
 */
public class Bags implements  Articles {

    private String name;     //名字
    private ArrayList<Articles> bags=new ArrayList<Articles>();
    public Bags(String name)
    {
        this.name=name;
    }
    public void add(Articles c)
    {
        bags.add(c);
    }
    public void remove(Articles c)
    {
        bags.remove(c);
    }
    public Articles getChild(int i)
    {
        return bags.get(i);
    }
    @Override
    public float calculation()
    {
        float s=0;
        for(Object obj:bags)
        {
            s+=((Articles)obj).calculation();
        }
        return s;
    }
    @Override
    public void show()
    {
        for(Object obj:bags)
        {
            ((Articles)obj).show();
        }
    }
}
