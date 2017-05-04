package bridge;

/**
 * Created by ivans on 04/05/2017.
 */
public class Main {
    public static void main(String[] args) {

        /*BasicSocialWeb facebook = new FBSocialWeb();


        ExtendedSocialWeb extendedSocialWeb = new ExtendedSocialWebAdapter(facebook);

        System.out.println(
                extendedSocialWeb.getHistory(1,"04.05.2017")

                + "\n" +

        extendedSocialWeb.getLikes(1,true,2)

        );*/

        Facade facade = new Facade();
        facade.doVKPortfolio();
        facade.doVKPaymentCheck();
        facade.doFBPortfolio();
        facade.doFBPaymentCheck();

    }
}
