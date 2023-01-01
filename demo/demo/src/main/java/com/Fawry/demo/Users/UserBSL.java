package com.Fawry.demo.Users;

import com.Fawry.demo.*;
import com.Fawry.demo.Aurthorize.Aurthorize;
import com.Fawry.demo.Aurthorize.SignIn;
import com.Fawry.demo.Payment.CreditCard;
import com.Fawry.demo.Payment.PaymentMethod;
import com.Fawry.demo.Payment.Wallet;
import com.Fawry.demo.Service.*;
import com.Fawry.demo.Service.Landline.MonthlyReceipt;
import com.Fawry.demo.Service.Landline.QuarterReceipt;
import com.Fawry.demo.Service.RechargeInternet.*;
import com.Fawry.demo.Transaction.Transaction;
import com.Fawry.demo.Transaction.Transactions;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@RestController
public class UserBSL{
    List<UserAccount> accounts=new ArrayList<UserAccount>();
    Service service;
    PaymentMethod paymentMethod;
    Transactions trans=new Transactions();
    Aurthorize aur;
    Refund refund=new Refund();

    public UserBSL(Transactions t,Refund r){
        refund=r;
        trans=t;
    }

    @PostMapping(value = "/UserAuthorize/{type}")
    public String Authorize(@RequestBody UserAccount a,@PathVariable("type") String type){
        if(type.equals("Signin")){
            aur=new SignIn();
            for(UserAccount aa:accounts){
                if(aur.signIn(aa.getEmail(),aa.getPassword(),a.getEmail(),a.getPassword())){
                    return "Signin compelete successfully";
                }
            }
            return "Signin Failed";
        }
        else if(type.equals("Signup")){
            accounts.add(a);
            return "SignUp compelte sucessfully";
        }
        return null;
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
}
