package FactoryMethod;

/**
 * author：heng.zhang
 * date：2018/4/17
 * description：
 */
class IntelligencePhone extends Phone {
    @Override
    void call() {
        System.out.print("智能机打电话");
    }

    @Override
    void sendMessage() {
        System.out.print("智能机发短信");
    }
}
