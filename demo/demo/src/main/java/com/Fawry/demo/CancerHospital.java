package com.Fawry.demo;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class CancerHospital extends DonationService {
    @Override
    public int serve(int amount,String sr) {
        if(sr.equals("57357")){
            return amount;
        }
        else if(sr.equals("500500")){
            return amount;
        }
        else if(sr.equals("Elnas")){
            return amount;
        }
        else{
            return -1;
        }
    }
}