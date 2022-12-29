package com.Fawry.demo;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class QuarterReceipt extends LandlineService {

    @Override
    public int serve(int amount,String place) {
        return amount;
    }

}