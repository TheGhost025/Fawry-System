package com.Fawry.demo;

import org.springframework.stereotype.Service;

@Service
public interface Discount {

    public int discount(int amount);
}