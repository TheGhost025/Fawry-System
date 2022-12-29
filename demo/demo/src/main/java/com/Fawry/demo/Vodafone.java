package com.Fawry.demo;

@org.springframework.stereotype.Service
public class Vodafone implements ServiceProvider {

    @Override
    public Service createRecharge() {
        return new VodafoneRecharge();
    }

    @Override
    public Service createInternet() {
        return new VodafoneInternet();
    }

}