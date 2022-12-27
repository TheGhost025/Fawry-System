package com.Fawry.demo;

import java.util.ArrayList;
import java.util.List;

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