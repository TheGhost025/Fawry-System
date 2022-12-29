package com.Fawry.demo;

public abstract class MobileRechargeService implements Service {
   Discount discount=null;
    public void SetDiscount(Discount d,int amount){
        discount=d;
        discount.discount(amount);
    }
    public boolean checkDiscount() {
        if(discount==null)
            return false;
        else
            return true;
    }
}