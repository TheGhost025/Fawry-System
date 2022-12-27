package com.Fawry.demo;

import java.util.Scanner;

public class Schools extends DonationService {
    @Override
    public int serve() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("choose between Schools Zeweilcity");
        String sr =myObj.nextLine();
        if(sr.equals("Zeweilcity")){
            System.out.println("Pay Donation for Resala");
            int amount=myObj.nextInt();
            System.out.println("Donation compelete for Zeweil City");
            return amount;
        }
        else{
            System.out.println("Not Found");
            return -1;
        }
    }
}