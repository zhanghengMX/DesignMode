package Proxy;

/**
 * author：heng.zhang
 * date：2018/4/23
 * description：
 */
public class ProxyTest {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealTenant());
        proxy.rentHouse();
    }
}
