package decorator;

/**
 * Created by ivans on 04/05/2017.
 */
public class RoumingTariff extends TariffDecorator {

    public RoumingTariff(CountTariffInterface tariffDecorator) {
        super(tariffDecorator);
    }

    @Override
    public void processTariff() {
        System.out.println("You have 10 days in rouming");
        super.processTariff();
    }
}
