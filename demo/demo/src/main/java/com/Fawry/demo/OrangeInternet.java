package com.Fawry.demo;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class OrangeInternet  extends InternetPaymentService {

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