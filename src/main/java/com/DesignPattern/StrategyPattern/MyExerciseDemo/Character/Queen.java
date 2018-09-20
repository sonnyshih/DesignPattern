package com.DesignPattern.StrategyPattern.MyExerciseDemo.Character;

import com.DesignPattern.StrategyPattern.MyExerciseDemo.Weapon.KnifeBehavior;

public class Queen extends Character {

    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void display() {
        System.out.println("I'm a Queen");
    }
}
