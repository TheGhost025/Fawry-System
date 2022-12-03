import java.util.Scanner;

public class OrangeInternet extends Orange implements InternetPaymentService {

    @Override
    public void serve() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("choose Internet Amount 100 200 300 400 500 GB");
        int amount =myObj.nextInt();
        if(amount==10){
            System.out.println("Internet Service complete with 100");
        }
        else if(amount==20){
            System.out.println("Internet Service complete with 200");
        }
        else if(amount==30){
            System.out.println("Internet Service complete with 300");
        }
        else if(amount==40){
            System.out.println("Internet Service complete with 400");
        }
        else if(amount==50){
            System.out.println("Internet Service complete with 500");
        }
        else{
            System.out.println("Not Found");
        }
    }

}