import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

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

    public void StateRefund(){
        List<Transaction> transactions=refunds.GetTransaction();
        for(Transaction t :transactions){
            t.GetTransaction();
            int x=transactions.indexOf(t);
            System.out.println("to reject press 0 to accept press 1");
            Scanner Myobj=new Scanner(System.in);
            boolean choose=Myobj.nextBoolean();
            t.Setstate(choose);
            if(t.Getstate()){
                refunds.ReturnMoney(t.getAmount());

            }
        }
    }


    void addDiscount(){
        System.out.println("While Service What you Want to Discount it Internet Recharge Landline Donation");
        Scanner Myobj=new Scanner(System.in);
        String choose=Myobj.next();
        if(choose.equals("Internet")){
            System.out.println("What Type Discount you need Overall Specific");
            choose=Myobj.next();
            if(choose.equals("Overall")){
                s=new InternetPaymentService() {
                    @Override
                    public int serve() {
                        return 1;
                    }
                };

                s.SetDiscount(new OverallDiscount());
                notifyObserver(choose+" Discount for Internet");
            }
            else if(choose.equals("Specific")){
                System.out.println("What Provider you need We Vodafone Etisalat Orange");
                choose=Myobj.next();
                if(choose.equals("We")){
                    sp=new WE();
                    s= sp.createInternet();
                    s.SetDiscount(new SpecificDiscount());
                    notifyObserver(choose+" Discount for We Internet");
                }
                if(choose.equals("Vodafone")){
                    sp=new Vodafone();
                    s= sp.createInternet();
                    s.SetDiscount(new SpecificDiscount());
                    notifyObserver(choose+" Discount for Vodafone Internet");
                }
                if(choose.equals("Etisalat")){
                    sp=new Etisalat();
                    s= sp.createInternet();
                    s.SetDiscount(new SpecificDiscount());
                    notifyObserver(choose+" Discount for Etisalat Internet");
                }
                if(choose.equals("Orange")){
                    sp=new Orange();
                    s= sp.createInternet();
                    s.SetDiscount(new SpecificDiscount());
                    notifyObserver(choose+" Discount for Orange Internet");
                }
            }
        }
        else if(choose.equals("Recharge")){
            System.out.println("What Type Discount you need Overall Specific");
            choose=Myobj.next();
            if(choose.equals("Overall")){
                s=new MobileRechargeService() {
                    @Override
                    public int serve() {
                        return 1;
                    }
                };

                s.SetDiscount(new OverallDiscount());
                notifyObserver(choose+" Discount for Mobile Rcharge");
            }
            else if(choose.equals("Specific")){
                System.out.println("What Provider you need We Vodafone Etisalat Orange");
                choose=Myobj.next();
                if(choose.equals("We")){
                    sp=new WE();
                    s= sp.createRecharge();
                    s.SetDiscount(new SpecificDiscount());
                    notifyObserver(choose+" Discount for Mobile Rcharge We");
                }
                if(choose.equals("Vodafone")){
                    sp=new Vodafone();
                    s= sp.createRecharge();
                    s.SetDiscount(new SpecificDiscount());
                    notifyObserver(choose+" Discount for Mobile Rcharge Vodafone");
                }
                if(choose.equals("Etisalat")){
                    sp=new Etisalat();
                    s= sp.createRecharge();
                    s.SetDiscount(new SpecificDiscount());
                    notifyObserver(choose+" Discount for Mobile Rcharge Etisalat");
                }
                if(choose.equals("Orange")){
                    sp=new Orange();
                    s= sp.createRecharge();
                    s.SetDiscount(new SpecificDiscount());
                    notifyObserver(choose+" Discount for Mobile Rcharge Orange");
                }
            }
        }
        else if(choose.equals("LandLine")){
            System.out.println("What Type Discount you need Overall Specific");
            choose=Myobj.next();
            if(choose.equals("Overall")){
                s=new LandlineService() {
                    @Override
                    public int serve() {
                        return 1;
                    }
                };

                s.SetDiscount(new OverallDiscount());
                notifyObserver(choose+" Discount for Landline");
            }
            else if(choose.equals("Specific")){
                System.out.println("What Provider you need Monthly Quarter");
                choose=Myobj.next();
                if(choose.equals("Monthly")){
                    s=new MonthlyReceipt();
                    s.SetDiscount(new SpecificDiscount());
                    notifyObserver(choose+" Discount for Landline Monthly Receipt");
                }
                if(choose.equals("Quarter")){
                    s=new QuarterReceipt();
                    s.SetDiscount(new SpecificDiscount());
                    notifyObserver(choose+" Discount for Landline Quarter Receipt");
                }
            }
        }
        else if(choose.equals("Donation")){
            System.out.println("What Type Discount you need Overall Specific");
            choose=Myobj.next();
            if(choose.equals("Overall")){
                s=new DonationService() {
                    @Override
                    public int serve() {
                        return 1;
                    }
                };

                s.SetDiscount(new OverallDiscount());
                notifyObserver(choose+" Discount for Donation");
            }
            else if(choose.equals("Specific")){
                System.out.println("What Provider you need Hospital NGOS School");
                choose=Myobj.next();
                if(choose.equals("Hospital")){
                    s=new CancerHospital();
                    s.SetDiscount(new SpecificDiscount());
                    notifyObserver(choose+" Discount for Donation for Cancer Hospitals");
                }
                if(choose.equals("NGOS")){
                    s=new NGOS();
                    s.SetDiscount(new SpecificDiscount());
                    notifyObserver(choose+" Discount for Donation for NGOS");
                }
                if(choose.equals("School")){
                    s=new Schools();
                    s.SetDiscount(new SpecificDiscount());
                    notifyObserver(choose+" Discount for Donation for Schools");
                }
            }
        }
    }

    @Override
    public void registerObserver(Notifications n) {
        Observers.add(n);
    }


    @Override
    public void removeObserver(Notifications n) {
        Observers.remove(n);
    }

    @Override
    public void notifyObserver(String d) {
        for(Notifications n:Observers){
            n.update(d);
        }
    }
}
