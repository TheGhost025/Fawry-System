package com.Fawry.demo;

import java.util.ServiceConfigurationError;

@org.springframework.stereotype.Service
public class Etisalat implements ServiceProvider{

    @Override
    public Service createRecharge() {
        return new EtisalatRecharge();
    }

    @Override
    public Service createInternet() {
        return new EtisalatInternet();
    }

}