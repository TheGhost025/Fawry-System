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
            refunds.Setstate(choose);
            if(refunds.Getstate()){
                refunds.ReturnMoney(x);

            }
        }
    }


    void addDiscount(){
        System.out.println("While Service What you Want to Discount it Internet Recharge Landline Donation");
        Scanner Myobj=new Scanner(System.in);
        String choose=Myobj.nextLine();
        if(choose=="Internet"){
            System.out.println("What Type Discount you need Overall Specific");
            choose=Myobj.nextLine();
            if(choose=="Overall"){
                s=new InternetPaymentService() {
                    @Override
                    public int serve() {
                        return 1;
                    }
                };

                s.SetDiscount(new OverallDiscount());
            }
            else if(choose=="Specific"){
                System.out.println("What Provider you need We Vodafone Etisalat Orange");
                choose=Myobj.nextLine();
                if(choose=="We"){
                    sp=new WE();
                    s= sp.createInternet();
                    s.SetDiscount(new SpecificDiscount());
                }
                if(choose=="Vodafone"){
                    sp=new Vodafone();
                    s= sp.createInternet();
                    s.SetDiscount(new SpecificDiscount());
                }
                if(choose=="Etisalat"){
                    sp=new Etisalat();
                    s= sp.createInternet();
                    s.SetDiscount(new SpecificDiscount());
                }
                if(choose=="Orange"){
                    sp=new Orange();
                    s= sp.createInternet();
                    s.SetDiscount(new SpecificDiscount());
                }
            }
        }
        else if(choose=="Recharge"){
            System.out.println("What Type Discount you need Overall Specific");
            choose=Myobj.nextLine();
            if(choose=="Overall"){
                s=new MobileRechargeService() {
                    @Override
                    public int serve() {
                        return 1;
                    }
                };

                s.SetDiscount(new OverallDiscount());
            }
            else if(choose=="Specific"){
                System.out.println("What Provider you need We Vodafone Etisalat Orange");
                choose=Myobj.nextLine();
                if(choose=="We"){
                    sp=new WE();
                    s= sp.createRecharge();
                    s.SetDiscount(new SpecificDiscount());
                }
                if(choose=="Vodafone"){
                    sp=new Vodafone();
                    s= sp.createRecharge();
                    s.SetDiscount(new SpecificDiscount());
                }
                if(choose=="Etisalat"){
                    sp=new Etisalat();
                    s= sp.createRecharge();
                    s.SetDiscount(new SpecificDiscount());
                }
                if(choose=="Orange"){
                    sp=new Orange();
                    s= sp.createRecharge();
                    s.SetDiscount(new SpecificDiscount());
                }
            }
        }
        else if(choose=="LandLine"){
            System.out.println("What Type Discount you need Overall Specific");
            choose=Myobj.nextLine();
            if(choose=="Overall"){
                s=new LandlineService() {
                    @Override
                    public int serve() {
                        return 1;
                    }
                };

                s.SetDiscount(new OverallDiscount());
            }
            else if(choose=="Specific"){
                System.out.println("What Provider you need Monthly Quarter");
                choose=Myobj.nextLine();
                if(choose=="Monthly"){
                    s=new MonthlyReceipt();
                    s.SetDiscount(new SpecificDiscount());
                }
                if(choose=="Quarter"){
                    s=new QuarterReceipt();
                    s.SetDiscount(new SpecificDiscount());
                }
            }
        }
        else if(choose=="Donation"){
            System.out.println("What Type Discount you need Overall Specific");
            choose=Myobj.nextLine();
            if(choose=="Overall"){
                s=new DonationService() {
                    @Override
                    public int serve() {
                        return 1;
                    }
                };

                s.SetDiscount(new OverallDiscount());
            }
            else if(choose=="Specific"){
                System.out.println("What Provider you need Hospital NGOS School");
                choose=Myobj.nextLine();
                if(choose=="Hospital"){
                    s=new CancerHospital();
                    s.SetDiscount(new SpecificDiscount());
                }
                if(choose=="NGOS"){
                    s=new NGOS();
                    s.SetDiscount(new SpecificDiscount());
                }
                if(choose=="School"){
                    s=new Schools();
                    s.SetDiscount(new SpecificDiscount());
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
