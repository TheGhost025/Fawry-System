package com.Fawry.demo.Discount;

import org.springframework.stereotype.Service;

@Service
public interface Discount {

    public int discount(int amount);
}