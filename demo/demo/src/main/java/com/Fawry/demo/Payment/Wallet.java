package com.Fawry.demo.Payment;

import org.springframework.stereotype.Service;

@Service
public class Wallet implements PaymentMethod {

    @Override
    public String pay() {
        return "Pay with Wallet";
    }
}
