package com.DesignPattern.StatePattern.GumballGameDemo.NewGumballGameDemo.state;

import com.DesignPattern.StatePattern.GumballGameDemo.NewGumballGameDemo.GumballMachine;
import com.DesignPattern.StatePattern.GumballGameDemo.NewGumballGameDemo.base.State;

import java.util.Random;

public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());

    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnQuarter() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);

        if ( (winner ==0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldSate());
        }

    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
