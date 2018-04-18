package FactoryMethod;

/**
 * author：heng.zhang
 * date：2018/4/18
 * description：
 */
class OldPhoneFactory extends Factory {
    @Override
    Phone createPhone() {
        return new OldPhone();
    }
}
