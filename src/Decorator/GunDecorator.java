package Decorator;

/**
 * author：heng.zhang
 * date：2018/4/16
 * description：具体的装饰者，给被装饰者增加属性和方法
 */
public class GunDecorator extends Decorator {
    @Override
    public void descMySelf() {
        System.out.print("拿枪的 ");
        super.descMySelf();
    }
}
