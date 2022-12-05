import java.util.Scanner;

public class NGOS extends DonationService {
    @Override
    public int serve() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("choose between NGOS BaytElZakat EqyptionFoodBank MisrElkhir AlOrman Resala");
        String sr =myObj.next();
        if(sr.equals("BaytElZakat")){
            System.out.println("Pay Donation for Bayt ElZakat");
            int amount=myObj.nextInt();
            System.out.println("Donation compelete for Bayt ElZakat");
            return amount;
        }
        else if(sr.equals("EqyptionFoodBank")){
            System.out.println("Pay Donation for Eqyption Food Bank");
            int amount=myObj.nextInt();
            System.out.println("Donation compelete for Eqyption Food Bank");
            return amount;
        }
        else if(sr.equals("MisrElkhir")){
            System.out.println("Pay Donation for Misr Elkhir");
            int amount=myObj.nextInt();
            System.out.println("Donation compelete for Misr Elkhir");
            return amount;
        }
        else if(sr.equals("AlOrman")){
            System.out.println("Pay Donation for AlOrman");
            int amount=myObj.nextInt();
            System.out.println("Donation compelete for AlOrman");
            return amount;
        }
        else if(sr.equals("Resala")){
            System.out.println("Pay Donation for Resala");
            int amount=myObj.nextInt();
            System.out.println("Donation compelete for Resala");
            return amount;
        }
        else{
            System.out.println("Not Found");
            return -1;
        }
    }
}