package com.DesignPattern.AdapterPattern.DuckDemo;

import com.DesignPattern.AdapterPattern.DuckDemo.adapter.TurkeyAdapter;
import com.DesignPattern.AdapterPattern.DuckDemo.animal.MallarDuck;
import com.DesignPattern.AdapterPattern.DuckDemo.animal.WildTurkey;

/* Adapter Pattern (轉接器模式) */
public class AdapterDemo {
    public static void main(String[] args) {
        MallarDuck duck = new MallarDuck();
        System.out.println("The Duck says...");
        duck.quack();
        duck.fly();

        WildTurkey turkey = new WildTurkey();
        System.out.println("\nThe Turkey says...");
        turkey.gobble();
        turkey.fly();


        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("\nThe TurkeyAdapter says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();

    }
}
