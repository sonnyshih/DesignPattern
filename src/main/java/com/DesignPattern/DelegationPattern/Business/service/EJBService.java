package com.DesignPattern.DelegationPattern.Business.service;

import com.DesignPattern.DelegationPattern.Business.base.BusinessService;

public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
