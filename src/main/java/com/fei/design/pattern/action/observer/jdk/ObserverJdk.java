package com.fei.design.pattern.action.observer.jdk;

import com.fei.design.pattern.built.singleton.lazy.LazyDoubleCheckSingleton;

import java.util.Observable;

/**
 * @Author Aning
 * @Date 2020/3/30 1:54 下午
 * @Version 1.0
 */
public class ObserverJdk extends Observable {

    private  String  name="生态圈";

    private  static  ObserverJdk observerJdk=null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private ObserverJdk() {
    }


    public  static ObserverJdk getInstance() {
        //第一层检查 解决线程等待
        if (null == observerJdk) {
            synchronized (LazyDoubleCheckSingleton.class){
                //第二层检查判断是否创建对象
                if (null == observerJdk){
                    observerJdk = new ObserverJdk();
                }
            }

        }
        return observerJdk;
    }



    public  void pulishQuestion(Question question){

        System.out.println(question.getName()+"在"+this.name+"上提交了一个问题");
        setChanged();
        notifyObservers(question);
    }
}
