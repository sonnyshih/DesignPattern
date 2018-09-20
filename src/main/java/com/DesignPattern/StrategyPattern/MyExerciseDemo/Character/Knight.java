package com.DesignPattern.StrategyPattern.MyExerciseDemo.Character;

import com.DesignPattern.StrategyPattern.MyExerciseDemo.Weapon.BowAndArrowBehavior;

public class Knight extends Character {

    public Knight() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void display() {
        System.out.println("I'm a Knight");
    }
}
