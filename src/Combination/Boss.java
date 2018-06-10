package Combination;

/**
 * author：heng.zhang
 * date：2018/6/10
 * description：树状结构的页节点，没有分支节点
 */
class Boss extends Component{
    @Override
    void addComponent(Component component) {
        //独立的个体，没有添加、删除分支节点的功能
    }

    @Override
    void removeComponent(Component component) {

    }

    @Override
    void describeMyself() {
        System.out.println("我是老板，不属于任何部门");
    }
}
