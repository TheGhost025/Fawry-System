package com.Fawry.demo.Service.RechargeInternet;

import EtisalatInternet;
import EtisalatRecharge;
import com.Fawry.demo.Service.Service;

@org.springframework.stereotype.Service
public class Etisalat implements ServiceProvider {

    @Override
    public Service createRecharge() {
        return new EtisalatRecharge();
    }

    @Override
    public Service createInternet() {
        return new EtisalatInternet();
    }

}