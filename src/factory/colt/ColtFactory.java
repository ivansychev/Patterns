package factory.colt;

import factory.Gun;
import factory.Revolver;
import factory.Rifle;
import factory.WeaponFactory;

/**
 * Created by ivans on 03/05/2017.
 */
public class ColtFactory implements WeaponFactory {
    @Override
    public Revolver createRevolver() {
        return new ColtRevolver();
    }

    @Override
    public Rifle createRifle() {
        return new ColtRifle();
    }

    @Override
    public Gun createGun() {
        return new ColtGun();
    }
}
