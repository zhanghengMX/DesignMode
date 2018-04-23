package Proxy;

/**
 * author：heng.zhang
 * date：2018/4/23
 * description：
 */
class Proxy extends Tenant {
    private RealTenant realTenant;

    Proxy(RealTenant realTenant) {
        this.realTenant = realTenant;
    }

    @Override
    void rentHouse() {
        realTenant.rentHouse();
    }
}
