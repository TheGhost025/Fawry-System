import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User implements Notifications{
    private String Name;
    private String Email;
    private String Password;

    Service service;
    PaymentMethod paymentMethod;
    Transactions trans=new Transactions();
    Aurthorize aur;
    Refund refund=new Refund();
    void Set(String n ,String e,String p){
        Name =n;
        Email=e;
        Password=p;

    }

    public void Authorize(){
        System.out.println("Want to Signin Signup");
        Scanner myObj=new Scanner(System.in);
        String a=myObj.nextLine();
        if(a=="Signin"){
            boolean state=false;
            aur=new SignIn();
            while(!state){
                System.out.println("Enter your email");
                String e=myObj.nextLine();
                System.out.println("Enter your Password");
                String p=myObj.nextLine();
                state=aur.signIn(Email,Password,e,p);
            }
        }
        if(a=="Signup"){
            boolean state=false;
            aur=new SignUp();
            while(!state){
                System.out.println("Enter your email");
                String e=myObj.nextLine();
                System.out.println("Enter your Password");
                String p=myObj.nextLine();
                state=aur.signUp();
            }
        }
    }
    public void searchService(String Service){
        if(Service=="recharge"){
            System.out.println("Found");
            chooseService(Service);
        }
        else if(Service=="internet"){
            System.out.println("Found");
            chooseService(Service);
        }
        else if(Service=="landline"){
            System.out.println("Found");
            chooseService(Service);
        }
        else if(Service=="donation"){
            System.out.println("Found");
            chooseService(Service);
        }
        else{
            System.out.println("NOT Found");
        }
    }

    public void refund(){
        List<Transaction> item=new ArrayList<Transaction>();
        Scanner myObj=new Scanner(System.in);
        item=trans.GetTransaction();
        for(Transaction t:item){
            t.GetTransaction();
            System.out.println("Do you refund it yes press 0");
            int x=myObj.nextInt();
            if(x==0){
                refund.SetTrans(t);
            }
        }
    }

    public void chooseService(String s){
        if(s=="recharge"){
            System.out.println("choose providers We Vodafone Etisalat Orange");
            Scanner Myobj=new Scanner(System.in);
            String ser=Myobj.nextLine();
            if(ser=="We"){
                service=new WERecharge();
                int x=service.serve();
                System.out.println("Pay with CreidtCard Wallet");
                String pay=Myobj.nextLine();
                if(pay=="CreidtCard"){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
                else if(pay=="Wallet"){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
            }
            if(ser=="Vodafone"){
                service=new VodafoneRecharge();
                int x=service.serve();
                System.out.println("Pay with CreidtCard Wallet");
                String pay=Myobj.nextLine();
                if(pay=="CreidtCard"){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
                else if(pay=="Wallet"){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
            }
            if(ser=="Etisalat"){
                service=new EtisalatRecharge();
                int x=service.serve();
                System.out.println("Pay with CreidtCard Wallet");
                String pay=Myobj.nextLine();
                if(pay=="CreidtCard"){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
                else if(pay=="Wallet"){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
            }
            if(ser=="Orange"){
                service=new OrangeRecharge();
                int x=service.serve();
                System.out.println("Pay with CreidtCard Wallet");
                String pay=Myobj.nextLine();
                if(pay=="CreidtCard"){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
                else if(pay=="Wallet"){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
            }
        }
        else if(s=="internet"){
            System.out.println("choose providers We Vodafone Etisalat Orange");
            Scanner Myobj=new Scanner(System.in);
            String ser=Myobj.nextLine();
            if(ser=="We"){
                service=new WEInternet();
                int x=service.serve();
                System.out.println("Pay with CreidtCard Wallet");
                String pay=Myobj.nextLine();
                if(pay=="CreidtCard"){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
                else if(pay=="Wallet"){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
            }
            if(ser=="Vodafone"){
                service=new VodafoneInternet();
                int x=service.serve();
                System.out.println("Pay with CreidtCard Wallet");
                String pay=Myobj.nextLine();
                if(pay=="CreidtCard"){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
                else if(pay=="Wallet"){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
            }
            if(ser=="Etisalat"){
                service=new EtisalatInternet();
                int x=service.serve();
                System.out.println("Pay with CreidtCard Wallet");
                String pay=Myobj.nextLine();
                if(pay=="CreidtCard"){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
                else if(pay=="Wallet"){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
            }
            if(ser=="Orange"){
                service=new OrangeInternet();
                int x=service.serve();
                System.out.println("Pay with CreidtCard Wallet");
                String pay=Myobj.nextLine();
                if(pay=="CreidtCard"){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
                else if(pay=="Wallet"){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
            }
        }
        else if(s=="landline"){
            System.out.println("choose beetween Monthly Quarter");
            Scanner Myobj=new Scanner(System.in);
            String ser=Myobj.nextLine();
            if(ser=="Monthly"){
                service=new MonthlyReceipt();
                int x=service.serve();
                System.out.println("Pay with CreidtCard Wallet");
                String pay=Myobj.nextLine();
                if(pay=="CreidtCard"){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
                else if(pay=="Wallet"){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
            }
            if(ser=="Quarter"){
                service=new QuarterReceipt();
                int x=service.serve();
                System.out.println("Pay with CreidtCard Wallet");
                String pay=Myobj.nextLine();
                if(pay=="CreidtCard"){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
                else if(pay=="Wallet"){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
            }
        }
        else if(s=="donation"){
            System.out.println("choose beetween Hospital NGOS School");
            Scanner Myobj=new Scanner(System.in);
            String ser=Myobj.nextLine();
            if(ser=="Hospital"){
                service=new MonthlyReceipt();
                int x=service.serve();
                System.out.println("Pay with CreidtCard Wallet");
                String pay=Myobj.nextLine();
                if(pay=="CreidtCard"){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
                else if(pay=="Wallet"){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
            }
            if(ser=="NGOS"){
                service=new QuarterReceipt();
                int x=service.serve();
                System.out.println("Pay with CreidtCard Wallet");
                String pay=Myobj.nextLine();
                if(pay=="CreidtCard"){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
                else if(pay=="Wallet"){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
            }
            if(ser=="School"){
                service=new QuarterReceipt();
                int x=service.serve();
                System.out.println("Pay with CreidtCard Wallet");
                String pay=Myobj.nextLine();
                if(pay=="CreidtCard"){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
                else if(pay=="Wallet"){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
            }
        }
    }

    @Override
    public void update(String s) {
        System.out.println("New Update "+s);
    }
}
