package com.DesignPattern.DelegationPattern.MyExercise;

import com.DesignPattern.DelegationPattern.MyExercise.base.WorkerService;
import com.DesignPattern.DelegationPattern.MyExercise.EmployeeLookUp.EmployeeType;

public class EmployeeDelegate {
    private EmployeeLookUp employeeLookUp;
    private WorkerService workerService;
    private EmployeeType employeeType;

    public EmployeeDelegate(EmployeeType employeeType) {
        this.employeeType = employeeType;

        employeeLookUp = new EmployeeLookUp();
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public void showEmployeeInfo(){
        employeeLookUp.setEmployeeType(employeeType);
        workerService = employeeLookUp.getEmployee();

        workerService.showPositionName();
        workerService.doWork();
    }
}
