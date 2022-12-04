import java.util.Scanner;

public class MonthlyReceipt extends LandlineService {

    @Override
    public int serve() {
        Scanner myObj=new Scanner(System.in);
        System.out.println("Pay Landline Monthly");
        int amount =myObj.nextInt();
        System.out.println("Monthly Receipt Landline Service Compelte");
        return amount;
    }

}