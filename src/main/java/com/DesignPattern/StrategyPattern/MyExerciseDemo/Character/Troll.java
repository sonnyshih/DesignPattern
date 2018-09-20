package com.DesignPattern.StrategyPattern.MyExerciseDemo.Character;

import com.DesignPattern.StrategyPattern.MyExerciseDemo.Weapon.AxeBehavior;

public class Troll extends Character {

    public Troll() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void display() {
        System.out.println("I'm a troll");
    }
}
