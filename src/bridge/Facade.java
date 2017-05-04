package bridge;

/**
 * Created by ivans on 04/05/2017.
 */
public class Facade {
    private VKSocialWeb vkSocialWeb;
    private FBSocialWeb fbSocialWeb;

    public Facade() {
        vkSocialWeb = new VKSocialWeb();
        fbSocialWeb = new FBSocialWeb();
    }

    public void doVKPortfolio()
    {
        vkSocialWeb.portfolio(vkSocialWeb.getHistory(), vkSocialWeb.getLikes(1,true,2));
    }
    public void doFBPortfolio()
    {
        fbSocialWeb.portfolio(fbSocialWeb.getHistory("04.05.2017"), fbSocialWeb.getLikes(1,true,2));
    }
    public void doVKPaymentCheck()
    {
        vkSocialWeb.inspect();
    }
    public void doFBPaymentCheck()
    {
        fbSocialWeb.inspect();
    }
}
