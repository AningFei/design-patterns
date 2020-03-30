package com.fei.design.pattern.action.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author Aning
 * @Date 2020/3/30 6:33 下午
 * @Version 1.0
 */
public class Teacher  implements Observer {

    private  String name;


    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        ObserverJdk observerJdk= (ObserverJdk) o;
        Question  question= (Question) arg;
        System.out.println("=====================");

        System.out.println(name+"老师，你好！\n"+
                "您收到了一个来自"+observerJdk.getName()+"的提问，希望您解答，问答内容如下： \n"+
                question.getContent()+"\n"
                +"提问者： "+question.getName()

                );

    }
}
