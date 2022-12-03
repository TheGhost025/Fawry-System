public class Wallet implements PaymentMethod{

    @Override
    public void pay() {
        System.out.println("Pay with Wallet");
    }
}
