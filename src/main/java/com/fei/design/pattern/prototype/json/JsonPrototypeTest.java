package com.fei.design.pattern.prototype.json;

import java.util.Arrays;
import java.util.List;

public class JsonPrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        List<String> types= Arrays.asList("2","w");
        JsonPrototype jsonPrototype=new JsonPrototype();
        jsonPrototype.setId(12);
        jsonPrototype.setName("Aning");
        jsonPrototype.setTypes(types);
        JsonPrototype jsonPrototype1=jsonPrototype.clone();
        System.out.println("jsonPrototype："+jsonPrototype.toString());
        System.out.println("jsonPrototype1："+jsonPrototype1.toString());
        System.out.println(jsonPrototype==jsonPrototype1);


    }
}
