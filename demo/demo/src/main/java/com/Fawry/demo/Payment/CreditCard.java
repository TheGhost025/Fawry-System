package com.Fawry.demo.Payment;

import org.springframework.stereotype.Service;

@Service
public class CreditCard implements PaymentMethod {
    @Override
    public String pay() {
        return "Pay with Credit Card";
    }
}
