package com.Fawry.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Transactions {
    List<Transaction> item=new ArrayList<>();

    void addTransaction(Transaction transaction) {
        item.add(transaction);
    }
    void removeTransaction(Transaction transaction) {
        item.remove(transaction);
    }

    List<Transaction> GetTransaction(){
        return item;
    }
}