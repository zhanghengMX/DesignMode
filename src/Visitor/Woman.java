package Visitor;

/**
 * author：heng.zhang
 * date：2018/6/29
 * description：
 */
public class Woman extends Human{
    @Override
    void execAction(Action action) {
        action.womenActionState();
    }
}
