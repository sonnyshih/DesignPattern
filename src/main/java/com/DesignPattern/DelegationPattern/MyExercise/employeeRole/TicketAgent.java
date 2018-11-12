package com.DesignPattern.DelegationPattern.MyExercise.employeeRole;

import com.DesignPattern.DelegationPattern.MyExercise.base.WorkerService;

public class TicketAgent implements WorkerService {

    @Override
    public void showPositionName() {
        System.out.println("I am a ticket agent.");
    }

    @Override
    public void doWork() {
        System.out.println("Help to order tickets.");
    }
}
