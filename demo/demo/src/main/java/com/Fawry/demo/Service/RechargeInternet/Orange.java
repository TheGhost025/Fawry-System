package com.Fawry.demo.Service.RechargeInternet;

import OrangeInternet;
import OrangeRecharge;
import com.Fawry.demo.Service.Service;

@org.springframework.stereotype.Service
public class Orange implements ServiceProvider {

    @Override
    public Service createRecharge() {
        return new OrangeRecharge();
    }

    @Override
    public Service createInternet() {
        return new OrangeInternet();
    }

}