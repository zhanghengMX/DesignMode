package Memento;

/**
 * author：heng.zhang
 * date：2018/6/9
 * description：要保存状态的类
 */
class GameRole {
    private int HP; //血量
    private int ATK; //攻击力
    private int DEF; //防御力

    public void initAttrs() {
        HP = ATK = DEF = 100;
    }

    public void fighting() {
        HP -= 5;
        ATK -= 10;
        DEF -= 15;
    }
    public Memento createMemento() {
        return new Memento(HP, ATK, DEF);
    }

    public void recoverMemento(Memento memento) {
        this.HP = memento.HP;
        this.ATK = memento.ATK;
        this.DEF = memento.DEF;
    }

    public void showAttrs() {
        System.out.println(String.format("HP : %d    ATK : %d   DEF : %d", HP, ATK, DEF));
    }
}
