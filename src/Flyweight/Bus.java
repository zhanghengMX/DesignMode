package Flyweight;

/**
 * author：heng.zhang
 * date：2018/6/28
 * description：
 */
public class Bus extends Car {
    private int seatNum = 40;
    @Override
    void showCarDetail(String brand, String fuel) {
        System.out.println("我是烧" + fuel + "的" + brand  + "公交车，准载" + seatNum + "人");
    }
}
