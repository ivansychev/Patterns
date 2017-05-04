package bridge;

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ivans on 04/05/2017.
 */
public class PostgreDB implements DB{

    @Override
    public List<String> getListOfFriends() {
        return Arrays.asList("Misha","Vova","Sveta");
    }

    @Override
    public int getMoney() {
        return 150;
    }

    @Override
    public List<String> getWall() {
        return Arrays.asList("postgres story1","postgres story2","postgres story3");
    }
}
