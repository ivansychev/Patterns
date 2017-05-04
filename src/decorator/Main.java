package decorator;

/**
 * Created by ivans on 04/05/2017.
 */
public class Main {
    public static void main(String[] args) {
        MainTariff mainTariff = new MainTariff();
        SMSTariff smsTariff = new SMSTariff(mainTariff);
        //RoumingTariff roumingTariff = new RoumingTariff(smsTariff);
        InternetTariff internetTariff = new InternetTariff(smsTariff);

        internetTariff.processTariff();

    }
}
