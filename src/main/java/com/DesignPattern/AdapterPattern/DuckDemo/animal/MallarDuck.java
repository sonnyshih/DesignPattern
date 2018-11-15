package com.DesignPattern.AdapterPattern.DuckDemo.animal;

import com.DesignPattern.AdapterPattern.DuckDemo.base.Duck;

public class MallarDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
