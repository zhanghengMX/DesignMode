package Visitor;

/**
 * author：heng.zhang
 * date：2018/6/29
 * description：
 */
public class Cooking extends Action {
    @Override
    void manActionState() {
        System.out.println("男人做饭不好吃");
    }

    @Override
    void womenActionState() {
        System.out.println("女人做饭很好吃");
    }
}
