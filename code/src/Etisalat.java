import java.util.ServiceConfigurationError;

public class Etisalat implements ServiceProvider{

    @Override
    public Service createRecharge() {
        return new EtisalatRecharge();
    }

    @Override
    public Service createInternet() {
        return new EtisalatInternet();
    }

}