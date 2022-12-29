package com.Fawry.demo;

import org.springframework.stereotype.Service;

@Service
public class CreditCard implements PaymentMethod{
    @Override
    public String pay() {
        return "Pay with Credit Card";
    }
}
