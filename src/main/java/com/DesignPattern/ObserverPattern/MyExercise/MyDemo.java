package com.DesignPattern.ObserverPattern.MyExercise;

import com.DesignPattern.ObserverPattern.MyExercise.observer.Order;
import com.DesignPattern.ObserverPattern.MyExercise.subject.Newspaper;

public class MyDemo {

    public static void main(String[] args) {
        Newspaper newspaper = new Newspaper();

        Order order1 = new Order("John");
        newspaper.registerObserver(order1);

        Order order2 = new Order("Peter");
        newspaper.registerObserver(order2);

        newspaper.setNewsData("Hello World!!");
        newspaper.removeObserver(order1);
//        newspaper.removeObserver(order2);

        newspaper.setNewsData("Say Hi!!");
    }

}
