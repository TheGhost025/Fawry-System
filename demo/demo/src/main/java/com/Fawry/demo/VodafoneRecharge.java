package com.Fawry.demo;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class VodafoneRecharge extends MobileRechargeService {

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