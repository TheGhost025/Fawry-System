import java.util.Scanner;

public class CancerHospital extends DonationService {
    @Override
    public void serve() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("choose between hospitals 57357 500500 Elnas");
        String amount =myObj.nextLine();
        if(amount=="57357"){
            System.out.println("Donation compelete for 57357 hotpital");
        }
        else if(amount=="500500"){
            System.out.println("Donation compelete for 500500 hotpital");
        }
        else if(amount=="Elnas"){
            System.out.println("Donation compelete for 500500 hotpital");
        }
        else{
            System.out.println("Not Found");
        }
    }
}