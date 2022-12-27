package com.Fawry.demo;

public abstract class LandlineService implements Service {
    Discount discount=null;
    public void SetDiscount(Discount d){
        discount=d;
        discount.discount();
    }
    public boolean checkDiscount() {
        if(discount==null)
            return false;
        else
            return true;
    }
}
