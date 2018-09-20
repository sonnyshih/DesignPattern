package com.DesignPattern.ObserverPattern.WeatherDemo.observer;

public interface Observer {
    void update(float temperatures, float humidity, float pressure);
}
