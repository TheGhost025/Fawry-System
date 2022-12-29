package com.Fawry.demo;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class Schools extends DonationService {
    @Override
    public int serve(int amount,String sr) {
        if(sr.equals("Zeweilcity")){
            return amount;
        }
        else{
            return -1;
        }
    }
}