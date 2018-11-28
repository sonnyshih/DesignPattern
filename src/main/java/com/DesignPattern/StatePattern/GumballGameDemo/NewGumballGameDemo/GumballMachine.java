package com.DesignPattern.StatePattern.GumballGameDemo.NewGumballGameDemo;

import com.DesignPattern.StatePattern.GumballGameDemo.NewGumballGameDemo.base.State;
import com.DesignPattern.StatePattern.GumballGameDemo.NewGumballGameDemo.state.*;

public class GumballMachine {
    private State soldOutState;
    private State noQuarterState;
    private State hasQurterState;
    private State soldSate;
    private State winnerState;

    private State state = soldOutState;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQurterState = new HasQuarterState(this);
        soldSate = new SoldState(this);
        winnerState =  new WinnerState(this);

        this.state = soldOutState;

        this.count = numberGumballs;

        if (numberGumballs > 0) {
            this.state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnQuarter();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("A gumball coming rolling out the slot.");
        if (count != 0) {
            count = count - 1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQurterState() {
        return hasQurterState;
    }

    public State getSoldSate() {
        return soldSate;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public void refill (int count) {
        this.count = count;
        state = noQuarterState;
    }

    public String toString(){
        StringBuffer stringBuffer =  new StringBuffer();
        stringBuffer.append("\nMighty Gumball, Inc.\n");
        stringBuffer.append("Java-enabled Standing Gumball Model #2004\n");
        stringBuffer.append("Inventory:" + count + " gumballs\n");

        if (state == soldOutState) {
            stringBuffer.append("Machine is sold out.");
        } else {
            stringBuffer.append("Machine is waiting for quarter");
        }

        return stringBuffer.toString();

    }
}
