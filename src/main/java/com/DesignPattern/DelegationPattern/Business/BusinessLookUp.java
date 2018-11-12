package com.DesignPattern.DelegationPattern.Business;

import com.DesignPattern.DelegationPattern.Business.base.BusinessService;
import com.DesignPattern.DelegationPattern.Business.service.EJBService;
import com.DesignPattern.DelegationPattern.Business.service.JMSService;

public class BusinessLookUp {

    public BusinessService getBusinessService(String serviceType){

        if (serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        } else {
            return new JMSService();
        }

    }
}
