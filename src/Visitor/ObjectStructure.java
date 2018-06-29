package Visitor;

import java.util.ArrayList;

/**
 * author：heng.zhang
 * date：2018/6/29
 * description：
 */
public class ObjectStructure {
    ArrayList<Human> humans = new ArrayList<>();

    void addHuman(Human human) {
        humans.add(human);
    }

    void removeHuman(Human human) {
        humans.remove(human);
    }

    void accept(Action action) {
        for (Human human : humans) {
            human.execAction(action);
        }
    }
}
