package FactoryMethod;

/**
 * author：heng.zhang
 * date：2018/4/17
 * description：
 */
class OldPhone extends Phone {
    @Override
    void call() {
        System.out.print("老人机打电话");
    }

    @Override
    void sendMessage() {
        System.out.print("老人机发短信");
    }
}
