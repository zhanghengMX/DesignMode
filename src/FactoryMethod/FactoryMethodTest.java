package FactoryMethod;

/**
 * author：heng.zhang
 * date：2018/4/18
 * description：
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        Factory factory = new IntelligencePhoneFactory();
        Phone phone = factory.createPhone();
        phone.call();

        Factory factory1 = new OldPhoneFactory();
        Phone phone1 = factory1.createPhone();
        phone1.sendMessage();
    }
}
