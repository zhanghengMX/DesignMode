package Proxy;

/**
 * author：heng.zhang
 * date：2018/4/23
 * description：
 */
class RealTenant extends Tenant {
    @Override
    void rentHouse() {
        System.out.print("I am a tenant and I want to rent a house");
    }
}
