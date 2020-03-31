package com.fei.design.pattern.action.visitor;

/**
 * @Author Aning
 * @Date 2020/3/31 8:17 下午
 * @Version 1.0
 */
public class VisitorTest {
    public static void main(String[] args) {
        SetMaterial setMaterial=new SetMaterial();


        setMaterial.add(new Paper());
        setMaterial.add(new Paper());
        setMaterial.add(new Cuprum());
        setMaterial.add(new Cuprum());

       String result= setMaterial.accept( new ArtCompany());
        System.out.println("结果为："+result);

        String result1= setMaterial.accept( new Mint());
        System.out.println("结果为："+result1);
    }
}
