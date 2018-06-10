package Combination;

import java.util.ArrayList;

/**
 * author：heng.zhang
 * date：2018/6/10
 * description：公司类，属于一个组合节点
 */
class Company extends Component{
    ArrayList<Component> components = new ArrayList<>();
    private String name;

    public Company(String name) {
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
        System.out.println("我是" + name + "公司, 我公司有以下部门： ");
        for (Component component : components) {
            component.describeMyself();
        }
    }
}
