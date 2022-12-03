import java.util.Scanner;

public class WERecharge extends WE implements MobileRechargeService {

    @Override
    public void serve() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("choose Recharge Amount 10 20 30 40 50");
        int amount =myObj.nextInt();
        if(amount==10){
            System.out.println("Recharge complete with 10");
        }
        else if(amount==20){
            System.out.println("Recharge complete with 20");
        }
        else if(amount==30){
            System.out.println("Recharge complete with 30");
        }
        else if(amount==40){
            System.out.println("Recharge complete with 40");
        }
        else if(amount==50){
            System.out.println("Recharge complete with 50");
        }
        else{
            System.out.println("Not Found");
        }
    }

}