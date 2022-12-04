public abstract class InternetPaymentService implements Service {

    Discount discount=null;
    public void SetDiscount(Discount d){
        discount=d;
        discount.discount();
    }
    public boolean checkDiscount() {
        if(discount==null) {
            System.out.println("Not Found");
            return false;
        }
        else{
            System.out.println("Found");
            return true;
        }
    }
}