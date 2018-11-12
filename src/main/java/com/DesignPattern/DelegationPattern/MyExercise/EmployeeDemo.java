package com.DesignPattern.DelegationPattern.MyExercise;

import static com.DesignPattern.DelegationPattern.MyExercise.EmployeeLookUp.EmployeeType.PASSENGER;
import static com.DesignPattern.DelegationPattern.MyExercise.EmployeeLookUp.EmployeeType.TICKET_AGENT;

public class EmployeeDemo {

    public static void main(String[] args) {

        showTicketAgentInfo();

        System.out.println(" ###### ");

        showPassengerInfo();
    }

    public static void showTicketAgentInfo(){
        EmployeeDelegate employeeDelegate = new EmployeeDelegate(TICKET_AGENT);
        Employee employee = new Employee(employeeDelegate);
        employee.showEmployeeInfo();
    }

    public static void showPassengerInfo(){
        EmployeeDelegate employeeDelegate = new EmployeeDelegate(PASSENGER);
        Employee employee = new Employee(employeeDelegate);
        employee.showEmployeeInfo();
    }


}
