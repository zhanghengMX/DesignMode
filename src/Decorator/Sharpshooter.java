package Decorator;

/**
 * author：heng.zhang
 * date：2018/4/16
 * description：被装饰着
 */
public class Sharpshooter extends PlayRole {
    @Override
    public void descMySelf() {
        System.out.print("狙击手");
    }
}
