package builder.galustan;

import builder.HouseBuilder;

/**
 * Created by ivans on 03/05/2017.
 */
public class DjamshutBuilder implements HouseBuilder {
    String basement;
    String walls;
    String roof;

    @Override
    public void fillBasement() {
        System.out.println("basement is filled");
    }

    @Override
    public void createWalls() {
        System.out.println("walls are built");
    }

    @Override
    public void createRoof() {
        System.out.println("roof is layed");
    }

    @Override
    public String getResult() {
        System.out.println("Result");
        return "Result";
    }
}
