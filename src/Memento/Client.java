package Memento;

/**
 * author：heng.zhang
 * date：2018/6/9
 * description：
 */
class Client {
    public static void main(String[] args) {
        GameRole role = new GameRole();
        role.initAttrs();
        role.showAttrs();

        System.out.println("保存属性");
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(role.createMemento());

        System.out.println("战斗后");
        role.fighting();
        role.showAttrs();

        System.out.println("恢复原来的属性");
        role.recoverMemento(caretaker.getMemento());
        role.showAttrs();

    }
}
