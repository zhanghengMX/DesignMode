package Combination;

/**
 * author：heng.zhang
 * date：2018/6/10
 * description：组合结构中的部件接口类
 */
abstract class Component {
    abstract void addComponent(Component component);
    abstract void removeComponent(Component component);
    abstract void describeMyself();
}
