package Decorator;

/**
 * author：heng.zhang
 * date：2018/4/16
 * description：
 */
public class BulletproofVestDecorator extends Decorator {
    @Override
    public void descMySelf() {
        System.out.print("穿防弹衣的 ");
        super.descMySelf();
    }
}
