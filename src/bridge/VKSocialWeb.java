package bridge;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ivans on 04/05/2017.
 */
public class VKSocialWeb extends BasicSocialWeb implements Detective, Inspector {
    public String getHistory()
    {
        return "VKSocialWebHistory";
    }
    List<Integer> getLikes(int userId, boolean showNegative, int messagaId)
    {
        return Arrays.asList(1,2,3);
    }

    @Override
    public void portfolio(String history, List likes) {
        System.out.println("vk portfolio:");
        System.out.println(history);
        System.out.println(likes);
    }

    @Override
    public void inspect() {
        super.getMoney();
    }
}
