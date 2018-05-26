package Singleton;

import java.util.HashMap;

/**
 * author：heng.zhang
 * date：2018/5/26
 * description：饿汉式单例
 */
public class Hungry {
    private static Hungry instance = new Hungry();

    private Hungry() {}

    public static Hungry getInstance() {
        return instance;
    }
}
