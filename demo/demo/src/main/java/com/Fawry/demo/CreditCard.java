package com.Fawry.demo;

public class CreditCard implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Pay with Credit Card");
    }
}
