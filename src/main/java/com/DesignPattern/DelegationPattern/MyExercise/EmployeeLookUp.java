package com.DesignPattern.DelegationPattern.MyExercise;

import com.DesignPattern.DelegationPattern.MyExercise.base.WorkerService;
import com.DesignPattern.DelegationPattern.MyExercise.employeeRole.Crew;
import com.DesignPattern.DelegationPattern.MyExercise.employeeRole.Passenger;
import com.DesignPattern.DelegationPattern.MyExercise.employeeRole.TicketAgent;

public class EmployeeLookUp {

    public enum EmployeeType {
        TICKET_AGENT, PASSENGER, CREW
    }

    private EmployeeType employeeType;

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public WorkerService getEmployee(){
        switch (employeeType) {
            case TICKET_AGENT:
                return new TicketAgent();

            case CREW:
                return new Crew();

            case PASSENGER:
            default:

                return new Passenger();
        }

    }


}
