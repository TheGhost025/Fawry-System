import java.util.Scanner;

public class NGOS extends DonationService {
    @Override
    public void serve() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("choose between NGOS BaytElZakat EqyptionFoodBank MisrElkhir AlOrman Resala");
        String amount =myObj.nextLine();
        if(amount=="BaytElZakat"){
            System.out.println("Donation compelete for Bayt ElZakat");
        }
        else if(amount=="EqyptionFoodBank"){
            System.out.println("Donation compelete for Eqyption Food Bank");
        }
        else if(amount=="MisrElkhir"){
            System.out.println("Donation compelete for Misr Elkhir");
        }
        else if(amount=="AlOrman"){
            System.out.println("Donation compelete for AlOrman");
        }
        else if(amount=="Resala"){
            System.out.println("Donation compelete for Resala");
        }
        else{
            System.out.println("Not Found");
        }
    }
}