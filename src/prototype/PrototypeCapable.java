package prototype;

/**
 * Created by ivans on 03/05/2017.
 */
public interface PrototypeCapable extends Cloneable {
    public PrototypeCapable clone() throws CloneNotSupportedException;
}