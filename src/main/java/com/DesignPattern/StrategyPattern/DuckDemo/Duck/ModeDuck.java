package com.DesignPattern.StrategyPattern.DuckDemo.Duck;

import com.DesignPattern.StrategyPattern.DuckDemo.fly.FlyNoWay;
import com.DesignPattern.StrategyPattern.DuckDemo.quack.Quack;

public class ModeDuck extends Duck {

    public ModeDuck () {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
