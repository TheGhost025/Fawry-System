package com.Fawry.demo.Service.RechargeInternet;

import com.Fawry.demo.Service.Service;

@org.springframework.stereotype.Service
public class WE implements ServiceProvider {

    @Override
    public Service createRecharge() {
        return new WERecharge();
    }

    @Override
    public Service createInternet() {
        return new WEInternet();
    }

}