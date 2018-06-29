package Visitor;

/**
 * author：heng.zhang
 * date：2018/6/29
 * description：
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addHuman(new Woman());
        objectStructure.addHuman(new Man());

        objectStructure.accept(new Cooking());

        objectStructure.accept(new Drive());
    }
}
