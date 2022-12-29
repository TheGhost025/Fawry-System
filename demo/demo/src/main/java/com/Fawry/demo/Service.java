package com.Fawry.demo;

public interface Service {
    boolean checkDiscount();
    public void SetDiscount(Discount d,int amount);
    public int serve(int amount,String place);
}
