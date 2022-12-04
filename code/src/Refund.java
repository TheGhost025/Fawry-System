import java.util.ArrayList;
import java.util.List;

public class Refund {
    boolean state;
    List<Transaction> transactions=new ArrayList<Transaction>();

    public void ReturnMoney(int x){
        System.out.println("Returned Money "+transactions.get(x).getAmount());
    }

    public void SetTrans(Transaction t){
        transactions.add(t);
    }

    public List<Transaction> GetTransaction(){
        return transactions;
    }

    public void Setstate(boolean s){
        state=s;
    }
    public boolean Getstate(){
        return state;
    }
}
