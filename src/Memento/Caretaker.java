package Memento;

/**
 * author：heng.zhang
 * date：2018/6/9
 * description：管理者类
 */
class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
