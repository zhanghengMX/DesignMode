package Flyweight;

/**
 * author：heng.zhang
 * date：2018/6/28
 * description：
 */
public class Client {
    public static void main(String[] args) {
        Car busA = CarFactory.createCar(CarFactory.TYPE_BUS);
        busA.showCarDetail("奔驰","天然气");

        Car salooncarCarA = CarFactory.createCar(CarFactory.TYPE_SALOONCAR);
        salooncarCarA.showCarDetail("吉利","石油");

        //复用享元对象
        Car busB = CarFactory.createCar(CarFactory.TYPE_BUS);
        busA.showCarDetail("丰田","石油");

        Car salooncarCarB = CarFactory.createCar(CarFactory.TYPE_SALOONCAR);
        salooncarCarA.showCarDetail("宝马","天然气");
    }
}
