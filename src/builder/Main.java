package builder;

import builder.galustan.DjamshutBuilder;
import builder.svetlakov.Boss;

/**
 * Created by ivans on 03/05/2017.
 */
public class Main {
    public static void main(String[] args) {
        DjamshutBuilder builder = new DjamshutBuilder();
        Boss boss = new Boss(builder);
        boss.build();
    }
}
