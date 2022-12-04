public class Transaction {
    String serviceProvider;
    String transactionType;
    int amount;
    public void SetTransaction(String s,String r,int a){
        serviceProvider=s;
        transactionType=r;
        amount=a;
    }

    public void GetTransaction(){
        System.out.println("Service Proivder: "+serviceProvider);
        System.out.println("Transaction Type: "+transactionType);
        System.out.println("Amount: "+amount);
    }
    public int getAmount(){
        return amount;
    }
}