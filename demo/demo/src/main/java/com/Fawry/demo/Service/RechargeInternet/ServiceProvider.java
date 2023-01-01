package com.Fawry.demo.Service.RechargeInternet;

import com.Fawry.demo.Service.Service;

public interface ServiceProvider {
    public Service createRecharge();
    public Service createInternet();
}