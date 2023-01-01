package com.Fawry.demo.Service.RechargeInternet;

import com.Fawry.demo.Service.RechargeInternet.MobileRechargeService;
import org.springframework.stereotype.Service;

@Service
public class OrangeRecharge extends MobileRechargeService {

    @Override
    public int serve(int amount,String place) {
        if(amount==10){
            return amount;
        }
        else if(amount==20){
            return amount;
        }
        else if(amount==30){
            return amount;
        }
        else if(amount==40){
            return amount;
        }
        else if(amount==50){
            return amount;
        }
        else{
            return -1;
        }
    }

}