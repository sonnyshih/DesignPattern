package com.DesignPattern.DelegationPattern.MyExercise.employeeRole;

import com.DesignPattern.DelegationPattern.MyExercise.base.WorkerService;

public class Passenger implements WorkerService {
    @Override
    public void showPositionName() {
        System.out.println("I am a passenger.");
    }

    @Override
    public void doWork() {
        System.out.println("Pay for my tickets.");
    }
}
