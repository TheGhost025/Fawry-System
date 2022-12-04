import java.util.Scanner;

public class VodafoneInternet extends InternetPaymentService {

    @Override
    public int serve() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("choose Internet Amount 100 200 300 400 500 GB");
        int amount =myObj.nextInt();
        if(amount==100){
            System.out.println("Internet Service complete with 100");
            return amount;
        }
        else if(amount==200){
            System.out.println("Internet Service complete with 200");
            return amount;
        }
        else if(amount==300){
            System.out.println("Internet Service complete with 300");
            return amount;
        }
        else if(amount==400){
            System.out.println("Internet Service complete with 400");
            return amount;
        }
        else if(amount==500){
            System.out.println("Internet Service complete with 500");
            return amount;
        }
        else{
            System.out.println("Not Found");
            return -1;
        }
    }

}