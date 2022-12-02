public class Cash implements PaymentMethod{

    @Override
    public void pay() {
        System.out.println("Pay with Cash");
    }
}
