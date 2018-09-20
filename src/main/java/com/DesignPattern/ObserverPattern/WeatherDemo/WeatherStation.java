package com.DesignPattern.ObserverPattern.WeatherDemo;

import com.DesignPattern.ObserverPattern.WeatherDemo.observer.CurrentConditionsDisplay;
import com.DesignPattern.ObserverPattern.WeatherDemo.subject.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.4f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
