package com.fei.design.pattern.built.builder;

/**
 * @Author Aning
 * @Date 2020/3/24 2:26 下午
 * @Version 1.0
 */
public class Product {
    private String partA;
    private String partB;
    private String partC;

    public Product() {
    }

    public Product(String partA, String partB, String partC) {
        this.partA = partA;
        this.partB = partB;
        this.partC = partC;
    }

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public  void show(){
        System.out.println(this.partA+"++++++"+this.partB+"++++++"+this.partC);
    }
}
