package com.DesignPattern.StatePattern.GumballGameDemo.NewGumballGameDemo.base;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnQuarter();
    void dispense();
}
