package com.DesignPattern.ObserverPattern.MyExercise.subject;

import com.DesignPattern.ObserverPattern.MyExercise.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Newspaper implements Subject {

    private List observers;
    private String newsData;

    public Newspaper() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(newsData);
        }
    }

    public void setNewsData(String newsData) {
        this.newsData = newsData;
        notifyObservers();
    }
}
