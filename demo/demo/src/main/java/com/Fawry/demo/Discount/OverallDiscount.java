package com.Fawry.demo.Discount;

public class OverallDiscount implements Discount {

    private int percentageDiscount = 0;
    @Override
    public int discount(int amount) {
        percentageDiscount=amount;
        return percentageDiscount;
    }

}