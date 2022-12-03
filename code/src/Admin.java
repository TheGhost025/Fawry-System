import java.util.LinkedList;

public class Admin implements Notifiers{
    String Name;
    String Email;
    LinkedList<Notifications> Observers=new LinkedList<Notifications>();


    boolean acceptRefund(){
        return true;
    }

    boolean rejectRefund(){
        return true;
    }

    void addDiscount(){

    }

    @Override
    public void registerObserver(Notifications n) {
        Observers.add(n);
    }


    @Override
    public void removeObserver(Notifications n) {
        Observers.remove(n);
    }

    @Override
    public void notifyObserver(String d) {
        for(Notifications n:Observers){
            n.update(d);
        }
    }
}
