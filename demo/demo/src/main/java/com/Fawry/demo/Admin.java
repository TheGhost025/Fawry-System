package com.Fawry.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@RestController
public class Admin implements Notifiers{
    String Name;
    String Email;
    LinkedList<Notifications> Observers=new LinkedList<Notifications>();
    ServiceProvider sp;
    Service s;
    Discount d;
    Refund refunds=new Refund();


    public Admin(String n,String e){
        Name=n;
        Email=e;
    }

    public Admin(){
        Name=null;
        Email=null;
    }

    public void setName(String name){
        Name=name;
    }

    public void setEmail(String email){
        Email=email;
    }

    public String getName(){
        return Name;
    }

    public String getEmail(){
        return Email;
    }

    public  void setRefund(Refund r){
        refunds=r;
    }

    @GetMapping(value = "/getRefundTransaction")
    public List<Transaction> transactions(){
        return refunds.GetTransaction();
    }

    @GetMapping(value="/stateRefund/{id}/{state}")
    public String StateRefund(int id,boolean state){
        List<Transaction> transactions=refunds.GetTransaction();
        Transaction t =new Transaction();
        t=transactions.get(id);
        t.Setstate(state);
        if(t.Getstate()){
            refunds.ReturnMoney(t.getAmount());
            return "Accept Refund";
    }
        return "Reject Refund";
    }

    @GetMapping(value = "/addDiscount/{ser}/{k}/{pro}/{k1}/{am}")
    public String addDiscount(@PathVariable("ser") String ser,@PathVariable("k") String k,@PathVariable("pro") String pro,@PathVariable("k1") String k1,@PathVariable("am") int am){
        if(ser.equals("Internet")){
            if(k.equals("Overall")){
                s = new InternetPaymentService() {
                    @Override
                    public int serve(int amount,String place) {
                        return 1;
                    }
                };
                s.SetDiscount(new OverallDiscount(),am);
                notifyObserver(k+" Discount for Internet");
                return "Add Discount Successfully";
            }
            else if(k.equals("Specific")){
                if(pro.equals("We")){
                    sp=new WE();
                    s= sp.createInternet();
                    s.SetDiscount(new SpecificDiscount(),am);
                    notifyObserver(k+" Discount for We Internet");
                    return "Add Discount Successfully";
                }
                if(pro.equals("Vodafone")){
                    sp=new Vodafone();
                    s= sp.createInternet();
                    s.SetDiscount(new SpecificDiscount(),am);
                    notifyObserver(k+" Discount for Vodafone Internet");
                    return "Add Discount Successfully";
                }
                if(pro.equals("Etisalat")){
                    sp=new Etisalat();
                    s= sp.createInternet();
                    s.SetDiscount(new SpecificDiscount(),am);
                    notifyObserver(k+" Discount for Etisalat Internet");
                    return "Add Discount Successfully";
                }
                if(pro.equals("Orange")){
                    sp=new Orange();
                    s= sp.createInternet();
                    s.SetDiscount(new SpecificDiscount(),am);
                    notifyObserver(k+" Discount for Orange Internet");
                    return "Add Discount Successfully";
                }
            }
        }
        else if(ser.equals("Recharge")){
            if(k.equals("Overall")){
                s=new MobileRechargeService() {
                    @Override
                    public int serve(int amount,String place) {
                        return 1;
                    }
                };

                s.SetDiscount(new OverallDiscount(),am);
                notifyObserver(k+" Discount for Mobile Rcharge");
                return "Add Discount Successfully";
            }
            else if(k.equals("Specific")){
                if(pro.equals("We")){
                    sp=new WE();
                    s= sp.createRecharge();
                    s.SetDiscount(new SpecificDiscount(),am);
                    notifyObserver(k+" Discount for Mobile Rcharge We");
                    return "Add Discount Successfully";
                }
                if(pro.equals("Vodafone")){
                    sp=new Vodafone();
                    s= sp.createRecharge();
                    s.SetDiscount(new SpecificDiscount(),am);
                    notifyObserver(k+" Discount for Mobile Rcharge Vodafone");
                    return "Add Discount Successfully";
                }
                if(pro.equals("Etisalat")){
                    sp=new Etisalat();
                    s= sp.createRecharge();
                    s.SetDiscount(new SpecificDiscount(),am);
                    notifyObserver(k+" Discount for Mobile Rcharge Etisalat");
                    return "Add Discount Successfully";
                }
                if(pro.equals("Orange")){
                    sp=new Orange();
                    s= sp.createRecharge();
                    s.SetDiscount(new SpecificDiscount(),am);
                    notifyObserver(k+" Discount for Mobile Rcharge Orange");
                    return "Add Discount Successfully";
                }
            }
        }
        else if(ser.equals("LandLine")){
            if(k.equals("Overall")){
                s=new LandlineService() {
                    @Override
                    public int serve(int amount,String place) {
                        return 1;
                    }
                };

                s.SetDiscount(new OverallDiscount(),am);
                notifyObserver(k+" Discount for Landline");
                return "Add Discount Successfully";
            }
            else if(k.equals("Specific")){
                if(k1.equals("Monthly")){
                    s=new MonthlyReceipt();
                    s.SetDiscount(new SpecificDiscount(),am);
                    notifyObserver(k+" Discount for Landline Monthly Receipt");
                    return "Add Discount Successfully";
                }
                if(k1.equals("Quarter")){
                    s=new QuarterReceipt();
                    s.SetDiscount(new SpecificDiscount(),am);
                    notifyObserver(k+" Discount for Landline Quarter Receipt");
                    return "Add Discount Successfully";
                }
            }
        }
        else if(ser.equals("Donation")){
            if(k.equals("Overall")){
                s=new DonationService() {
                    @Override
                    public int serve(int amount,String place) {
                        return 1;
                    }
                };

                s.SetDiscount(new OverallDiscount(),am);
                notifyObserver(k+" Discount for Donation");
                return "Add Discount Successfully";
            }
            else if(k.equals("Specific")){
                if(k1.equals("Hospital")){
                    s=new CancerHospital();
                    s.SetDiscount(new SpecificDiscount(),am);
                    notifyObserver(k+" Discount for Donation for Cancer Hospitals");
                    return "Add Discount Successfully";
                }
                if(k1.equals("NGOS")){
                    s=new NGOS();
                    s.SetDiscount(new SpecificDiscount(),am);
                    notifyObserver(k+" Discount for Donation for NGOS");
                    return "Add Discount Successfully";
                }
                if(k1.equals("School")){
                    s=new Schools();
                    s.SetDiscount(new SpecificDiscount(),am);
                    notifyObserver(k+" Discount for Donation for Schools");
                    return "Add Discount Successfully";
                }
            }
        }
        return null;
    }

    @PostMapping(value = "/registerObserver")
    @Override
    public void registerObserver(@RequestBody Notifications n) {
        Observers.add(n);
    }


    @PostMapping(value = "/removeObserver")
    @Override
    public void removeObserver(@RequestBody Notifications n) {
        Observers.remove(n);
    }

    @Override
    public void notifyObserver(String d) {
        for(Notifications n:Observers){
            n.update(d);
        }
    }
}
