package com.DesignPattern.StatePattern.GumballGameDemo.NewGumballGameDemo.state;

import com.DesignPattern.StatePattern.GumballGameDemo.NewGumballGameDemo.GumballMachine;
import com.DesignPattern.StatePattern.GumballGameDemo.NewGumballGameDemo.base.State;

public class NoQuarterState implements State {

    private GumballMachine gumballMachine;


    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter.");
        gumballMachine.setState(gumballMachine.getHasQurterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted quarter.");
    }

    @Override
    public void turnQuarter() {
        System.out.println("You turned, but there no quarter.");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first.");
    }
}
