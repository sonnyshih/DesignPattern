package com.DesignPattern.ObserverPattern.WeatherDemo.observer;

import com.DesignPattern.ObserverPattern.WeatherDemo.display.DisplayElement;
import com.DesignPattern.ObserverPattern.WeatherDemo.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperatures;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperatures, float humidity, float pressure) {
        this.temperatures = temperatures;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperatures + "F degree and " +
                + humidity +"% humidity");
    }

}
