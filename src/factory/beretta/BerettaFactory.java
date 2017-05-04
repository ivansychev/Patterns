package factory.beretta;

import factory.Gun;
import factory.Revolver;
import factory.Rifle;
import factory.WeaponFactory;

/**
 * Created by ivans on 03/05/2017.
 */
public class BerettaFactory implements WeaponFactory {
    @Override
    public Revolver createRevolver() {
        return new BerettaRevolver();
    }

    @Override
    public Rifle createRifle() {
        return new BerettaRifle();
    }

    @Override
    public Gun createGun() {
        return new BerettaGun();
    }
}
