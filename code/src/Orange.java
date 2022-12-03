public class Orange implements ServiceProvider {

    @Override
    public Service createRecharge() {
        return new OrangeRecharge();
    }

    @Override
    public Service createInternet() {
        return new OrangeInternet();
    }

}