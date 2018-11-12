package com.DesignPattern.DelegationPattern.Business;


/* ##### Delegation Pattern 委託模式 ##### */
public class BusinessDemo {

    public static void main(String[] args) {

        showClient1();

        showClient2();

    }

    public static void showClient1(){
        BusinessDelegate businessDelegate = new BusinessDelegate();

        Client client = new Client(businessDelegate);
        client.doTask();

    }

    public static void showClient2(){
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

    }
}
