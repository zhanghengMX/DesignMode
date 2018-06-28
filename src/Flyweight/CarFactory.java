package Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * author：heng.zhang
 * date：2018/6/28
 * description：
 */
public class CarFactory {
    static final int TYPE_BUS = 0x0001;
    static final int TYPE_SALOONCAR = 0x0002;
    private static final Map<Integer, Car> carMap = new HashMap<>();

    static Car createCar(int type) {
        if (carMap.containsKey(type)) {
            return carMap.get(type);
        } else {
            Car car = null;
            switch (type) {
                case TYPE_BUS:
                    car = new Bus();
                    break;
                case TYPE_SALOONCAR:
                    car = new SaloonCar();
                    break;
            }
            carMap.put(type, car);
            return car;
        }

    }
}
