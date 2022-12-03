public interface Notifiers {
    public void registerObserver(Notifications n);
    public void removeObserver(Notifications n);
    public void notifyObserver(String d);
}
