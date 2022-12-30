package com.Fawry.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;

public class UserAccount implements Notifications{
    private String Name;
    private String Email;
    private String Password;

    public void setName(String name){
        Name=name;
    }
    public void setEmail(String email){
        Email=email;
    }
    public void setPassword(String pass){
        Password=pass;
    }
    @Override
    public String update(String s) {
        return "New Update "+s;
    }
}
