package com.fei.design.pattern.prototype.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * y原型模式 copy
 */
public class JsonPrototype {
    private String name;

    private Integer id;


    private List<String> types;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    @Override
    protected JsonPrototype clone() throws CloneNotSupportedException {
        String jsonStr= JSONObject.toJSONString(this);
        JSONObject jsonObject = JSON.parseObject(jsonStr);
        return JSONObject.toJavaObject(jsonObject,JsonPrototype.class);
    }

    @Override
    public String toString() {
        return "JsonPrototype{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", types=" + types .toString()+
                '}';
    }
}
