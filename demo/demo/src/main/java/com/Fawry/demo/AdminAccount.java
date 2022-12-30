package com.Fawry.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.LinkedList;

public class AdminAccount implements Notifiers{
    String Name;
    String Email;
    String Password;
    LinkedList<Notifications> Observers=new LinkedList<Notifications>();

    public AdminAccount(String n,String e,String p){
        Name=n;
        Email=e;
        Password=p;
    }

    public AdminAccount(){
        Name=null;
        Email=null;
        Password=null;
    }

    public void setName(String name){
        Name=name;
    }

    public void setEmail(String email){
        Email=email;
    }

    public String getName(){
        return Name;
    }

    public String getEmail(){
        return Email;
    }

    @PostMapping(value = "/registerObserver")
    @Override
    public void registerObserver(@RequestBody Notifications n) {
        Observers.add(n);
    }


    @PostMapping(value = "/removeObserver")
    @Override
    public void removeObserver(@RequestBody Notifications n) {
        Observers.remove(n);
    }

    @Override
    public void notifyObserver(String d) {
        for(Notifications n:Observers){
            n.update(d);
        }
    }
}
