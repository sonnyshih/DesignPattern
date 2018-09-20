package com.DesignPattern.ObserverPattern.WeatherDemo.subject;


import com.DesignPattern.ObserverPattern.WeatherDemo.observer.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList observers;
    private float temperatures;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperatures, humidity, pressure);
        }
    }

    public void setMeasurements(float temperatures, float humidity, float pressure) {
        this.temperatures = temperatures;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChange();
    }

    public void measurementsChange(){
        notifyObservers();
    }

}
