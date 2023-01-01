package com.Fawry.demo.Transaction;

import com.Fawry.demo.Transaction.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Transactions {
    List<Transaction> item=new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        item.add(transaction);
    }
    void removeTransaction(Transaction transaction) {
        item.remove(transaction);
    }

    public List<Transaction> GetTransaction(){
        return item;
    }
}