package Flyweight;

/**
 * author：heng.zhang
 * date：2018/6/28
 * description：
 */
public class SaloonCar extends Car {
    private String type = "三厢";
    @Override
    void showCarDetail(String brand, String fuel) {
        System.out.println("我是烧" + fuel + "的" + brand + type + "轿车");
    }
}
