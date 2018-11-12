package com.DesignPattern.DelegationPattern.MyExercise;

public class Employee {
    private EmployeeDelegate employeeDelegate;

    public Employee(EmployeeDelegate employeeDelegate) {
        this.employeeDelegate = employeeDelegate;
    }

    public void showEmployeeInfo(){
        employeeDelegate.showEmployeeInfo();
    }

}
