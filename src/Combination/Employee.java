package Combination;

/**
 * author：heng.zhang
 * date：2018/6/10
 * description：员工类，属于树状结构中的页节点，没有分支
 */
class Employee extends Component{
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    void addComponent(Component component) {
        //页节点，没有添加和删除子分支的功能
    }

    @Override
    void removeComponent(Component component) {

    }

    @Override
    void describeMyself() {
        System.out.printf(name);
    }
}
