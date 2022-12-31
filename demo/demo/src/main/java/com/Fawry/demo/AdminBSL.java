package com.Fawry.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@RestController
public class AdminBSL{
    List<AdminAccount> accounts=new ArrayList<AdminAccount>();
    ServiceProvider sp;
    Service s;
    Discount d;
    Aurthorize aur;
    Transactions transactions=new Transactions();
    Refund refunds=new Refund();

    public AdminBSL(Transactions t,Refund r){
        refunds=r;
        transactions=t;
    }

    @PostMapping(value = "/AdminAuthorize/{type}")
    public String Authorize(@RequestBody AdminAccount a,@PathVariable("type") String type){
        if(type.equals("Signin")){
            if(accounts.contains(a)){
                return "SignIn compelte successfully";
            }
            else{
                return "SignIn failed";
            }
        }
        else if(type.equals("Signup")){
            accounts.add(a);
            return "SignUp compelte sucessfully";
        }
        return null;
    }

    @GetMapping(value = "/getRefundTransaction")
    public List<Transaction> transactions(){
        return refunds.GetTransaction();
    }

    @GetMapping(value = "/getUserTransaction")
    public List<Transaction> usertransactions(){
        return transactions.GetTransaction();
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
                return "Add Discount Successfully";
            }
            else if(k.equals("Specific")){
                if(pro.equals("We")){
                    sp=new WE();
                    s= sp.createInternet();
                    s.SetDiscount(new SpecificDiscount(),am);
                    return "Add Discount Successfully";
                }
                if(pro.equals("Vodafone")){
                    sp=new Vodafone();
                    s= sp.createInternet();
                    s.SetDiscount(new SpecificDiscount(),am);
                    return "Add Discount Successfully";
                }
                if(pro.equals("Etisalat")){
                    sp=new Etisalat();
                    s= sp.createInternet();
                    s.SetDiscount(new SpecificDiscount(),am);
                    return "Add Discount Successfully";
                }
                if(pro.equals("Orange")){
                    sp=new Orange();
                    s= sp.createInternet();
                    s.SetDiscount(new SpecificDiscount(),am);
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
                return "Add Discount Successfully";
            }
            else if(k.equals("Specific")){
                if(pro.equals("We")){
                    sp=new WE();
                    s= sp.createRecharge();
                    s.SetDiscount(new SpecificDiscount(),am);
                    return "Add Discount Successfully";
                }
                if(pro.equals("Vodafone")){
                    sp=new Vodafone();
                    s= sp.createRecharge();
                    s.SetDiscount(new SpecificDiscount(),am);
                    return "Add Discount Successfully";
                }
                if(pro.equals("Etisalat")){
                    sp=new Etisalat();
                    s= sp.createRecharge();
                    s.SetDiscount(new SpecificDiscount(),am);
                    return "Add Discount Successfully";
                }
                if(pro.equals("Orange")){
                    sp=new Orange();
                    s= sp.createRecharge();
                    s.SetDiscount(new SpecificDiscount(),am);
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
                return "Add Discount Successfully";
            }
            else if(k.equals("Specific")){
                if(k1.equals("Monthly")){
                    s=new MonthlyReceipt();
                    s.SetDiscount(new SpecificDiscount(),am);
                    return "Add Discount Successfully";
                }
                if(k1.equals("Quarter")){
                    s=new QuarterReceipt();
                    s.SetDiscount(new SpecificDiscount(),am);
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
                return "Add Discount Successfully";
            }
            else if(k.equals("Specific")){
                if(k1.equals("Hospital")){
                    s=new CancerHospital();
                    s.SetDiscount(new SpecificDiscount(),am);
                    return "Add Discount Successfully";
                }
                if(k1.equals("NGOS")){
                    s=new NGOS();
                    s.SetDiscount(new SpecificDiscount(),am);
                    return "Add Discount Successfully";
                }
                if(k1.equals("School")){
                    s=new Schools();
                    s.SetDiscount(new SpecificDiscount(),am);
                    return "Add Discount Successfully";
                }
            }
        }
        return null;
    }
}
