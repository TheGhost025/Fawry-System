import java.util.Scanner;

public class OverallDiscount implements Discount {

    private int percentageDiscount = 0;
    @Override
    public int discount() {
        Scanner MyObj=new Scanner(System.in);
        System.out.println("Enter amount Overall Discount: ");
        int amount=MyObj.nextInt();
        percentageDiscount=amount;
        return percentageDiscount;
    }

}