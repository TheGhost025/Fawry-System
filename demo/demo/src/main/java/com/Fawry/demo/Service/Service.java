package com.Fawry.demo.Service;

import com.Fawry.demo.Discount.Discount;

public interface Service {
    boolean checkDiscount();
    public void SetDiscount(Discount d, int amount);
    public int serve(int amount,String place);
}
