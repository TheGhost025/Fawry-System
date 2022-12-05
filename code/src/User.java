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
        String a=myObj.next();
        if(a.equals("Signin")){
            aur=new SignIn();
            while(true){
                System.out.println("Enter your email");
                String e=myObj.next();
                System.out.println("Enter your Password");
                String p=myObj.next();
                if(aur.signIn(Email,Password,e,p)){
                    break;
                };
            }
        }
        else if(a.equals("Signup")){
            aur=new SignUp();
            while(true){
                System.out.println("Enter your email");
                String e=myObj.next();
                System.out.println("Enter your Password");
                String p=myObj.next();
                if(aur.signUp()){
                    break;
                }
            }
        }
    }
    public void searchService(String Service){
        if(Service.equals("recharge")){
            System.out.println("Found");
            chooseService(Service);
        }
        else if(Service.equals("internet")){
            System.out.println("Found");
            chooseService(Service);
        }
        else if(Service.equals("landline")){
            System.out.println("Found");
            chooseService(Service);
        }
        else if(Service.equals("donation")){
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
        if(s.equals("recharge")){
            System.out.println("choose providers We Vodafone Etisalat Orange");
            Scanner Myobj=new Scanner(System.in);
            String ser=Myobj.next();
            if(ser.equals("We")){
                service=new WERecharge();
                int x=service.serve();
                System.out.println("Pay with CreidtCard Wallet");
                String pay=Myobj.next();
                if(pay.equals("CreidtCard")){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
                else if(pay.equals("Wallet")){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
            }
            else if(ser.equals("Vodafone")){
                service=new VodafoneRecharge();
                int x=service.serve();
                System.out.println("Pay with CreidtCard Wallet");
                String pay=Myobj.next();
                if(pay.equals("CreidtCard")){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
                else if(pay.equals("Wallet")){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
            }
            else if(ser.equals("Etisalat")){
                service=new EtisalatRecharge();
                int x=service.serve();
                System.out.println("Pay with CreidtCard Wallet");
                String pay=Myobj.next();
                if(pay.equals("CreidtCard")){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
                else if(pay.equals("Wallet")){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
            }
            else if(ser.equals("Orange")){
                service=new OrangeRecharge();
                int x=service.serve();
                System.out.println("Pay with CreidtCard Wallet");
                String pay=Myobj.next();
                if(pay.equals("CreidtCard")){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
                else if(pay.equals("Wallet")){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
            }
        }
        else if(s.equals("internet")){
            System.out.println("choose providers We Vodafone Etisalat Orange");
            Scanner Myobj=new Scanner(System.in);
            String ser=Myobj.next();
            if(ser.equals("We")){
                service=new WEInternet();
                int x=service.serve();
                System.out.println("Pay with CreidtCard Wallet");
                String pay=Myobj.nextLine();
                if(pay.equals("CreidtCard")){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
                else if(pay.equals("Wallet")){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
            }
            else if(ser.equals("Vodafone")){
                service=new VodafoneInternet();
                int x=service.serve();
                System.out.println("Pay with CreidtCard Wallet");
                String pay=Myobj.next();
                if(pay.equals("CreidtCard")){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
                else if(pay.equals("Wallet")){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
            }
            else if(ser.equals("Etisalat")){
                service=new EtisalatInternet();
                int x=service.serve();
                System.out.println("Pay with CreidtCard Wallet");
                String pay=Myobj.next();
                if(pay.equals("CreidtCard")){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
                else if(pay.equals("Wallet")){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
            }
            else if(ser.equals("Orange")){
                service=new OrangeInternet();
                int x=service.serve();
                System.out.println("Pay with CreidtCard Wallet");
                String pay=Myobj.next();
                if(pay.equals("CreidtCard")){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
                else if(pay.equals("Wallet")){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
            }
        }
        else if(s.equals("landline")){
            System.out.println("choose beetween Monthly Quarter");
            Scanner Myobj=new Scanner(System.in);
            String ser=Myobj.next();
            if(ser.equals("Monthly")){
                service=new MonthlyReceipt();
                int x=service.serve();
                System.out.println("Pay with CreidtCard Wallet");
                String pay=Myobj.nextLine();
                if(pay.equals("CreidtCard")){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
                else if(pay.equals("Wallet")){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
            }
            else if(ser.equals("Quarter")){
                service=new QuarterReceipt();
                int x=service.serve();
                System.out.println("Pay with CreidtCard Wallet");
                String pay=Myobj.next();
                if(pay.equals("CreidtCard")){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
                else if(pay.equals("Wallet")){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
            }
        }
        else if(s.equals("donation")){
            System.out.println("choose beetween Hospital NGOS School");
            Scanner Myobj=new Scanner(System.in);
            String ser=Myobj.next();
            if(ser.equals("Hospital")){
                service=new MonthlyReceipt();
                int x=service.serve();
                System.out.println("Pay with CreidtCard Wallet");
                String pay=Myobj.next();
                if(pay.equals("CreidtCard")){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
                else if(pay.equals("Wallet")){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
            }
            else if(ser.equals("NGOS")){
                service=new QuarterReceipt();
                int x=service.serve();
                System.out.println("Pay with CreidtCard Wallet");
                String pay=Myobj.next();
                if(pay.equals("CreidtCard")){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
                else if(pay.equals("Wallet")){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
            }
            else if(ser.equals("School")){
                service=new QuarterReceipt();
                int x=service.serve();
                System.out.println("Pay with CreidtCard Wallet");
                String pay=Myobj.next();
                if(pay.equals("CreidtCard")){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                }
                else if(pay.equals("Wallet")){
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
