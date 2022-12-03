public interface MobileRechargeService extends Service {
    public default boolean checkDiscount() {
        return true;
    }
    public void serve();
}