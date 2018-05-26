package Singleton;

/**
 * author：heng.zhang
 * date：2018/5/26
 * description： 懒汉式单例
 */
public class Lazy {
    private static Lazy instance;
    private Lazy(){}

    public static Lazy getInstance() {
        //TODO 解决多线程访问安全问题
        if (instance == null) {
            instance = new Lazy();
        }
        return instance;
    }
}
