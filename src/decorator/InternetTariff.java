package decorator;

/**
 * Created by ivans on 04/05/2017.
 */
public class InternetTariff extends TariffDecorator {

    public InternetTariff(CountTariffInterface tariffDecorator) {
        super(tariffDecorator);
    }

    @Override
    public void processTariff() {
        System.out.println("You have 3.5 MB/s internet");
        super.processTariff();
    }
}
