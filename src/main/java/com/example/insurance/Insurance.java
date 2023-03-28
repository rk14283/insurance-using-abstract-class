package com.example.insurance;

public abstract class Insurance {
    String Insurance;

    public void PhoneInsurancePurchasePrice(){
        System.out.println("Phone insurance costs $200 a month.");

    }
    public void HouseInsurancePurchasePrice(){
        System.out.println("House insurance costs $1000 a month.");
    }

    public void  CarInsurancePurchasePrice(){
        System.out.println("Car insurance costs $600 a month.");
    }
}
