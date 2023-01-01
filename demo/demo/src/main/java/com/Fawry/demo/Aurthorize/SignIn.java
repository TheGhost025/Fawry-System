package com.Fawry.demo.Aurthorize;

import com.Fawry.demo.Users.UserAccount;
import org.springframework.stereotype.Service;

@Service
public class SignIn implements Aurthorize {
    UserAccount u=new UserAccount();
    public boolean signIn(String Email,String Password,String e,String p) {
        if (Email == e) {
            if (Password == p) {
                return true;
            } else {
                return false;
            }
        } else if (Password == p) {
            if (Email == e) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean signUp() {
        return false;
    }
}
