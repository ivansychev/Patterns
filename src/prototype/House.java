package prototype;

import java.util.List;

/**
 * Created by ivans on 03/05/2017.
 */
public class House implements PrototypeCapable {

    private int houseNumber;
    private String houseName;
    private List<Neighbour> neighbours;

    @Override
    public House clone() throws CloneNotSupportedException {
        System.out.println("Cloning house object");
        return (House) super.clone();
    }

}
