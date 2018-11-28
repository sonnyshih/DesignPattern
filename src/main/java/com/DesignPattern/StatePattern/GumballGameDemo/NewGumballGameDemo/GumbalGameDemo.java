package com.DesignPattern.StatePattern.GumballGameDemo.NewGumballGameDemo;

/* ##### State Pattern 狀態模式 ##### */
public class GumbalGameDemo {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("-----------------------------------");
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("-----------------------------------");
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("-----------------------------------");
        System.out.println(gumballMachine);

    }
}
