package com.Fawry.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@RestController
public class User implements Notifications{
    private String Name;
    private String Email;
    private String Password;

    Service service;
    PaymentMethod paymentMethod;
    Transactions trans=new Transactions();
    Aurthorize aur;
    Refund refund=new Refund();

    void Set(String n ,String e, String p){
        Name =n;
        Email=e;
        Password=p;

    }

    void Get(String n ,String e,String p){
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

    @GetMapping(value = "/searchService/{s}")
    public String searchService(@PathVariable("s") String Service){
        if(Service.equals("recharge")){
            return "Found";
        }
        else if(Service.equals("internet")){
            return "Found";
        }
        else if(Service.equals("landline")){
            return "Found";
        }
        else if(Service.equals("donation")){
            return "Found";
        }
        else{
            return "Not Found";
        }
    }

    @GetMapping(value="/getTransactions")
    public List<Transaction> transactions(){
        return trans.GetTransaction();
    }

    @GetMapping(value="/refund/{id}")
    public String refund(@PathVariable("id") int id){
        List<Transaction> item=new ArrayList<Transaction>();
        Scanner myObj=new Scanner(System.in);
        item=trans.GetTransaction();
        Transaction t=new Transaction();
        t= item.get(id);
        refund.SetTrans(t);
        return "Complete Successfully";
    }

    @GetMapping(value = "/chooseService/{s}/{p}/{pay}/{ser}/{am}/{pl}")
    public Transaction chooseService(@PathVariable("s") String s,@PathVariable("p") String p,@PathVariable("pay") String pay,@PathVariable("ser") String ser,@PathVariable("am") int amount,@PathVariable("pl") String place){
        if(s.equals("recharge")){
            if(p.equals("We")){
                service=new WERecharge();
                int x=service.serve(amount,place);
                if(pay.equals("CreidtCard")){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(p,s,x);
                    trans.addTransaction(t);
                    return t;
                }
                else if(pay.equals("Wallet")){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(p,s,x);
                    trans.addTransaction(t);
                    return t;
                }
            }
            else if(p.equals("Vodafone")){
                service=new VodafoneRecharge();
                int x=service.serve(amount,place);
                if(pay.equals("CreidtCard")){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(p,s,x);
                    trans.addTransaction(t);
                    return t;
                }
                else if(pay.equals("Wallet")){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(p,s,x);
                    trans.addTransaction(t);
                    return t;
                }
            }
            else if(p.equals("Etisalat")){
                service=new EtisalatRecharge();
                int x=service.serve(amount,place);
                if(pay.equals("CreidtCard")){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(p,s,x);
                    trans.addTransaction(t);
                    return t;
                }
                else if(pay.equals("Wallet")){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(p,s,x);
                    trans.addTransaction(t);
                    return t;
                }
            }
            else if(p.equals("Orange")){
                service=new OrangeRecharge();
                int x=service.serve(amount,place);
                if(pay.equals("CreidtCard")){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(p,s,x);
                    trans.addTransaction(t);
                    return t;
                }
                else if(pay.equals("Wallet")){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(p,s,x);
                    trans.addTransaction(t);
                    return t;
                }
            }
        }
        else if(s.equals("internet")){
            if(p.equals("We")){
                service=new WEInternet();
                int x=service.serve(amount,place);
                if(pay.equals("CreidtCard")){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(p,s,x);
                    trans.addTransaction(t);
                    return t;
                }
                else if(pay.equals("Wallet")){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                    return t;
                }
            }
            else if(p.equals("Vodafone")){
                service=new VodafoneInternet();
                int x=service.serve(amount,place);
                if(pay.equals("CreidtCard")){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(p,s,x);
                    trans.addTransaction(t);
                }
                else if(pay.equals("Wallet")){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                    return t;
                }
            }
            else if(p.equals("Etisalat")){
                service=new EtisalatInternet();
                int x=service.serve(amount,place);
                if(pay.equals("CreidtCard")){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(p,s,x);
                    trans.addTransaction(t);
                    return t;
                }
                else if(pay.equals("Wallet")){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(p,s,x);
                    trans.addTransaction(t);
                    return t;
                }
            }
            else if(p.equals("Orange")){
                service=new OrangeInternet();
                int x=service.serve(amount,place);
                if(pay.equals("CreidtCard")){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                    return t;
                }
                else if(pay.equals("Wallet")){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(p,s,x);
                    trans.addTransaction(t);
                    return t;
                }
            }
        }
        else if(s.equals("landline")){
            if(ser.equals("Monthly")){
                service=new MonthlyReceipt();
                int x=service.serve(amount,place);
                if(pay.equals("CreidtCard")){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                    return t;
                }
                else if(pay.equals("Wallet")){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                    return t;
                }
            }
            else if(ser.equals("Quarter")){
                service=new QuarterReceipt();
                int x=service.serve(amount,place);
                if(pay.equals("CreidtCard")){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                    return t;
                }
                else if(pay.equals("Wallet")){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                    return t;
                }
            }
        }
        else if(s.equals("donation")){
            if(ser.equals("Hospital")){
                service=new MonthlyReceipt();
                int x=service.serve(amount,place);
                if(pay.equals("CreidtCard")){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                    return t;
                }
                else if(pay.equals("Wallet")){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                    return t;
                }
            }
            else if(ser.equals("NGOS")){
                service=new QuarterReceipt();
                int x=service.serve(amount,place);
                if(pay.equals("CreidtCard")){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                    return t;
                }
                else if(pay.equals("Wallet")){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                    return t;
                }
            }
            else if(ser.equals("School")){
                service=new QuarterReceipt();
                int x=service.serve(amount,place);
                if(pay.equals("CreidtCard")){
                    paymentMethod=new CreditCard();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                    return t;
                }
                else if(pay.equals("Wallet")){
                    paymentMethod=new Wallet();
                    paymentMethod.pay();
                    Transaction t =new Transaction();
                    t.SetTransaction(ser,s,x);
                    trans.addTransaction(t);
                    return t;
                }
            }
        }
        return null;
    }

    @Override
    public String update(String s) {
        return "New Update "+s;
    }
}
