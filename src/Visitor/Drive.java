package Visitor;

/**
 * author：heng.zhang
 * date：2018/6/29
 * description：
 */
public class Drive extends Action {
    @Override
    void manActionState() {
        System.out.println("男人开车很快");
    }

    @Override
    void womenActionState() {
        System.out.println("女人开车很慢");
    }
}
