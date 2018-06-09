package Memento;

/**
 * author：heng.zhang
 * date：2018/6/9
 * description：备忘录类
 */
class Memento {
    int HP; //血量
    int ATK; //攻击力
    int DEF; //防御力

    public Memento(int HP, int ATK, int DEF) {
        this.HP = HP;
        this.ATK = ATK;
        this.DEF = DEF;
    }
}
