package com.Fawry.demo.Service.Donation;

import com.Fawry.demo.Discount.Discount;
import com.Fawry.demo.Service.Service;

public abstract class DonationService implements Service {

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
