package com.DesignPattern.DelegationPattern.MyExercise;

import static com.DesignPattern.DelegationPattern.MyExercise.EmployeeLookUp.EmployeeType.TICKET_AGENT;

public class EmployeeDemo {

    public static void main(String[] args) {

        showTicketAgentInfo();

    }

    public static void showTicketAgentInfo(){
        EmployeeDelegate employeeDelegate = new EmployeeDelegate(TICKET_AGENT);
        Employee employee = new Employee(employeeDelegate);
        employee.showEmployeeInfo();
    }


}
