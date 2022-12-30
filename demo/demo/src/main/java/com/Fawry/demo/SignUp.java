package com.Fawry.demo;

import java.util.Scanner;

public class SignUp implements Aurthorize{
    UserAccount u = new UserAccount();
    @Override
    public boolean signIn(String Email, String Password, String e, String p) {
        return false;
    }

    public boolean signUp(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String n = myObj.next();
        System.out.println("Enter Your Email: ");
        String e = myObj.next();
        System.out.println("Enter Your Password: ");
        String p = myObj.next();
        return true;
    }
}
