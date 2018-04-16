package Decorator;

/**
 * author：heng.zhang
 * date：2018/4/16
 * description：
 */
public class Main {
    public static void main(String[] args) {
        Sharpshooter sharpshooter = new Sharpshooter();
        BulletproofVestDecorator bulletproofVestDecorator = new BulletproofVestDecorator();
        GunDecorator gunDecorator = new GunDecorator();

        gunDecorator.setPlayRole(sharpshooter);
        bulletproofVestDecorator.setPlayRole(gunDecorator);
        bulletproofVestDecorator.descMySelf();
    }
}
