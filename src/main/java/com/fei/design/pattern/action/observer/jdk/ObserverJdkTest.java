package com.fei.design.pattern.action.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author Aning
 * @Date 2020/3/30 6:40 下午
 * @Version 1.0
 */
public class ObserverJdkTest {
    public static void main(String[] args) {

        ObserverJdk observerJdk=ObserverJdk.getInstance();
        observerJdk.setName(" 火星");
        Teacher teacher=new Teacher("Aning");
        Teacher jack=new Teacher("jack");
        observerJdk.addObserver(teacher);
        observerJdk.addObserver(jack);
        Question question=new Question();
        question.setName("Fei");
        question.setContent("Where are you from?");
        observerJdk.pulishQuestion(question);
    }
}
