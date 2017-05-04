package decorator;

/**
 * Created by ivans on 04/05/2017.
 */
public class SMSTariff extends TariffDecorator {

    public SMSTariff(CountTariffInterface tariffDecorator) {
        super(tariffDecorator);
    }

    @Override
    public void processTariff() {
        System.out.println("you have 100 sms left");
        super.processTariff();
    }
}
