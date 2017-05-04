package bridge;

import java.util.List;

/**
 * Created by ivans on 04/05/2017.
 */
public class ExtendedSocialWebAdapter implements ExtendedSocialWeb {

    private BasicSocialWeb basicSocialWeb;

    public ExtendedSocialWebAdapter(BasicSocialWeb basicSocialWeb) {
        this.basicSocialWeb = basicSocialWeb;
    }

    @Override
    public String getHistory(int id, String date) {
        if(basicSocialWeb instanceof BasicSocialWeb)
        {
            return new VKSocialWeb().getHistory();
        }
        if(basicSocialWeb instanceof FBSocialWeb)
        {
            return new FBSocialWeb().getHistory(date);
        }
        return null;
    }

    @Override
    public List<Integer> getLikes(int id, boolean showNegative, int messageId) {
        if(basicSocialWeb instanceof BasicSocialWeb)
        {
            return new VKSocialWeb().getLikes(id, showNegative, messageId);
        }
        if(basicSocialWeb instanceof FBSocialWeb)
        {
            return new FBSocialWeb().getLikes(messageId, showNegative, id);
        }
        return null;
    }
}
