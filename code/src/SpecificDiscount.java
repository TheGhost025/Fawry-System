import java.util.Scanner;

public class SpecificDiscount implements Discount {

    private int percentageDiscount = 0;
    @Override
    public int discount() {
        Scanner MyObj=new Scanner(System.in);
        System.out.println("Enter amount Specific Discount: ");
        int amount=MyObj.nextInt();
        percentageDiscount=amount;
        return percentageDiscount;
    }

}