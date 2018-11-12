package com.DesignPattern.DelegationPattern.MyExercise.employeeRole;

import com.DesignPattern.DelegationPattern.MyExercise.base.WorkerService;

public class Crew implements WorkerService {
    @Override
    public void showPositionName() {
        System.out.println("I am a air crew.");
    }

    @Override
    public void doWork() {
        System.out.println("Private the Service in the airplane.");
    }
}
