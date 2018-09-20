package com.DesignPattern.ObserverPattern.MyExercise.observer;

import com.DesignPattern.ObserverPattern.MyExercise.display.DisplayElement;

public class Order implements Observer, DisplayElement {

    private String orderPerson;
    private String newsData;

    public Order(String orderPerson) {
        this.orderPerson = orderPerson;
    }

    @Override
    public void update(String newsData) {
        this.newsData = newsData;
        display();
    }

    @Override
    public void display() {
        System.out.println(orderPerson + " gets the news: " + newsData);
    }


}
