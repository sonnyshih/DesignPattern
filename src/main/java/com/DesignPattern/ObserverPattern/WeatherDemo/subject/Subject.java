package com.DesignPattern.ObserverPattern.WeatherDemo.subject;

import com.DesignPattern.ObserverPattern.WeatherDemo.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
