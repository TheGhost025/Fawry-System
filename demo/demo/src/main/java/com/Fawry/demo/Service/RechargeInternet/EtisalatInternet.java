package com.Fawry.demo.Service.RechargeInternet;

import InternetPaymentService;
import org.springframework.stereotype.Service;

@Service
public class EtisalatInternet  extends InternetPaymentService {

    @Override
    public int serve(int amount,String place) {
        if(amount==100){
            return amount;
        }
        else if(amount==200){
            return amount;
        }
        else if(amount==300){
            return amount;
        }
        else if(amount==400){
            return amount;
        }
        else if(amount==500){
            return amount;
        }
        else{
            return -1;
        }
    }

}