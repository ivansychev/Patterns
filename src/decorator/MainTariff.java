package decorator;

/**
 * Created by ivans on 04/05/2017.
 */
public class MainTariff implements CountTariffInterface{
    @Override
    public void processTariff() {
        System.out.println("Это основной тариф");
    }
}
