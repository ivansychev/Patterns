package bridge;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ivans on 04/05/2017.
 */
public class FBSocialWeb extends BasicSocialWeb implements Detective, Inspector {
    String getHistory(String date)
    {
        return "FacebookSocialWeb history";
    }
    List<Integer> getLikes(int messagaId, boolean showNegative, int userId)
    {
        return Arrays.asList(3,2,1);
    }

    @Override
    public void portfolio(String history, List likes) {
        System.out.println("fb portfolio:");
        System.out.println(history);
        System.out.println(likes);
    }

    @Override
    public void inspect() {
        super.getMoney();
    }
}
