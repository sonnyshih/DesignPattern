package com.DesignPattern.StrategyPattern.MyExerciseDemo;

import com.DesignPattern.StrategyPattern.MyExerciseDemo.Character.Character;
import com.DesignPattern.StrategyPattern.MyExerciseDemo.Character.King;
import com.DesignPattern.StrategyPattern.MyExerciseDemo.Character.Queen;
import com.DesignPattern.StrategyPattern.MyExerciseDemo.Weapon.AxeBehavior;

public class GameSimulator {

    public static void main(String[] args) {

        Character king = new King();
        king.display();
        king.performWeapon();

        Character queen = new Queen();
        queen.display();
        queen.performWeapon();
        queen.setWeaponBehavior(new AxeBehavior());
        queen.performWeapon();

    }

}
