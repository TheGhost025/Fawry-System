package com.Fawry.demo;

import java.util.Scanner;

public class QuarterReceipt extends LandlineService {

    @Override
    public int serve() {
        Scanner myObj=new Scanner(System.in);
        System.out.println("Pay Landline Quarter");
        int amount =myObj.nextInt();
        System.out.println("Monthly Receipt Landline Service Compelte");
        return amount;
    }

}