package com.DesignPattern.ObserverPattern.MyExercise.subject;

import com.DesignPattern.ObserverPattern.MyExercise.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
