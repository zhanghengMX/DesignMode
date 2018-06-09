package Adapter.ObjectAdapter;

/**
 * author：heng.zhang
 * date：2018/6/9
 * description：
 */
class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.newMethod();
    }
}
