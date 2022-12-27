package com.Fawry.demo;

import java.util.Scanner;

public class OrangeRecharge extends MobileRechargeService{

    @Override
    public int serve() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("choose Recharge Amount 10 20 30 40 50");
        int amount =myObj.nextInt();
        if(amount==10){
            System.out.println("Recharge complete with 10");
            return amount;
        }
        else if(amount==20){
            System.out.println("Recharge complete with 20");
            return amount;
        }
        else if(amount==30){
            System.out.println("Recharge complete with 30");
            return amount;
        }
        else if(amount==40){
            System.out.println("Recharge complete with 40");
            return amount;
        }
        else if(amount==50){
            System.out.println("Recharge complete with 50");
            return amount;
        }
        else{
            System.out.println("Not Found");
            return -1;
        }
    }

}