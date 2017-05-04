package decorator;

/**
 * Created by ivans on 04/05/2017.
 */
public class TariffDecorator implements CountTariffInterface{

    private CountTariffInterface tariffDecorator;

    @Override
    public void processTariff() {
        tariffDecorator.processTariff();
    }

    public TariffDecorator(CountTariffInterface tariffDecorator) {
        this.tariffDecorator = tariffDecorator;
    }
}
