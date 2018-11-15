package com.DesignPattern.AdapterPattern.DuckDemo.animal;

import com.DesignPattern.AdapterPattern.DuckDemo.base.Turkey;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");

    }
}
