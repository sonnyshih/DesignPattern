package com.DesignPattern.StatePattern.GumballGameDemo.OldGumballGameDemo.Machine;

public class GumbalGameDemo {
    public static void main(String[] args) {

        GumballMachine gumballMachine = new GumballMachine(5);  // Have 5 candies in the machine.
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("-----------------------------------");
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        System.out.println("-----------------------------------");
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();

        System.out.println("-----------------------------------");
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("-----------------------------------");
        System.out.println(gumballMachine);

    }
}
