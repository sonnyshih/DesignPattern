package com.DesignPattern.StrategyPattern.MyExerciseDemo.Character;

import com.DesignPattern.StrategyPattern.MyExerciseDemo.Weapon.SwordBehavior;

public class King extends Character {

    public King() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void display() {
        System.out.println("I'm a king");
    }
}
