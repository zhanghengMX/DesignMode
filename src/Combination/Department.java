package Combination;

import java.util.ArrayList;

/**
 * author：heng.zhang
 * date：2018/6/10
 * description：组合节点，可以拥有分支节点
 */
class Department extends Component{
    ArrayList<Component> components = new ArrayList<>();
    private String name;

    public Department(String name) {
        this.name = name;
    }

    @Override
    void addComponent(Component component) {
        components.add(component);
    }

    @Override
    void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    void describeMyself() {
        System.out.println("\n" + name + ", 有以下员工： ");
        for (Component component : components) {
            component.describeMyself();
        }
    }
}
