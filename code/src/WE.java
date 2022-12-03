public class WE implements ServiceProvider {

    @Override
    public Service createRecharge() {
        return new WERecharge();
    }

    @Override
    public Service createInternet() {
        return new WEInternet();
    }

}