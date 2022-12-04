import java.util.Scanner;

public class CancerHospital extends DonationService {
    @Override
    public int serve() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("choose between hospitals 57357 500500 Elnas");
        String sr =myObj.nextLine();
        if(sr=="57357"){
            System.out.println("Pay Donation for 57357");
            int amount=myObj.nextInt();
            System.out.println("Donation compelete for 57357 hotpital");
            return amount;
        }
        else if(sr=="500500"){
            System.out.println("Pay Donation for 500500");
            int amount=myObj.nextInt();
            System.out.println("Donation compelete for 500500 hotpital");
            return amount;
        }
        else if(sr=="Elnas"){
            System.out.println("Pay Donation for Elnas");
            int amount=myObj.nextInt();
            System.out.println("Donation compelete for Elnas hotpital");
            return amount;
        }
        else{
            System.out.println("Not Found");
            return -1;
        }
    }
}