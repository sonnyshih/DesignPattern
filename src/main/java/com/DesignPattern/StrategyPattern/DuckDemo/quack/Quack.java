package com.DesignPattern.StrategyPattern.DuckDemo.quack;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
