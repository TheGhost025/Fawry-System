package com.Fawry.demo.Users;

public class UserAccount implements Notifications {
    private String Name;
    private String Email;
    private String Password;

    public void setName(String name){
        Name=name;
    }

    public void setEmail(String email){
        Email=email;
    }
    public void setPassword(String password){
        Password=password;
    }

    public String getName(){
        return Name;
    }

    public String getEmail(){
        return Email;
    }

    public String getPassword(){
        return Password;
    }
    @Override
    public String update(String s) {
        return "New Update "+s;
    }
}
