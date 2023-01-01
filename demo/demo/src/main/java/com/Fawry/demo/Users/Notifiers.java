package com.Fawry.demo.Users;

import com.Fawry.demo.Users.Notifications;

public interface Notifiers {
    public void registerObserver(Notifications n);
    public void removeObserver(Notifications n);
    public void notifyObserver(String d);
}
