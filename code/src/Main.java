import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean state=true;
        Scanner muObj=new Scanner(System.in);
        while(state){
            System.out.println("you User or Admin if you User press 0 if you are Admin press 1 if you you want to exit press any thing");
            int x=muObj.nextInt();
            User user=new User();
            if(x==0){
                user.Authorize();
                boolean state1=true;
                while (state1){
                    System.out.println("if you want to search to take a service press 0 if you want to refund something press 1 if you you want to exit press any thing");
                    int z=muObj.nextInt();
                    if(z==0){
                        System.out.println("Enter what you want to search to serve like recharge internet donation landline");
                        String y=muObj.next();
                        user.searchService(y);
                    }
                    else if(z==1){
                        user.refund();
                    }
                    else {
                        state1=false;
                    }
                }
            }
            else if(x==1){
                System.out.println("Enter Your Name: ");
                String n=muObj.next();
                System.out.println("Enter Your Email: ");
                String e=muObj.next();
                Admin admin=new Admin(n,e);
                admin.registerObserver(user);
                boolean state1=true;
                while (state1){
                    System.out.println("if you want to add Discount to some service press 0 if you want to State the list of refund press 1 if you you want to exit press any thing");
                    int z=muObj.nextInt();
                    if(z==0){
                        admin.addDiscount();
                    }
                    else if(z==1){
                        admin.StateRefund();
                    }
                    else {
                        state1=false;
                    }
                }

            }
            else{
                state=false;
            }
        }
    }
}