package com.DesignPattern.StrategyPattern.DuckDemo.quack;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
