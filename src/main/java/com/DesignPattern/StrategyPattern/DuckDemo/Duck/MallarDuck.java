package com.DesignPattern.StrategyPattern.DuckDemo.Duck;

import com.DesignPattern.StrategyPattern.DuckDemo.fly.FlyNoWay;
import com.DesignPattern.StrategyPattern.DuckDemo.quack.Quack;

public class MallarDuck extends Duck {

    public MallarDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
