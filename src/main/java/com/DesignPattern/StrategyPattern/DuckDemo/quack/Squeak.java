package com.DesignPattern.StrategyPattern.DuckDemo.quack;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
