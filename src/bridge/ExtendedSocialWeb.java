package bridge;

import java.util.List;

/**
 * Created by ivans on 04/05/2017.
 */
public interface ExtendedSocialWeb {
    String getHistory(int id, String date);
    List<Integer> getLikes(int id, boolean showNegative, int messageId);
}
