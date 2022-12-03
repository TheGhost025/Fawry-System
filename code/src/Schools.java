import java.util.Scanner;

public class Schools extends DonationService {
    @Override
    public void serve() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("choose between Schools Zeweilcity");
        String amount =myObj.nextLine();
        if(amount=="Zeweilcity"){
            System.out.println("Donation compelete for Zeweil City");
        }
        else{
            System.out.println("Not Found");
        }
    }
}