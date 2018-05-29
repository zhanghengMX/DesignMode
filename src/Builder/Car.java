package Builder;

import java.util.ArrayList;

/**
 * author：heng.zhang
 * date：2018/5/29
 * description：建造的产品类
 */
class Car {
    private String brands;
    private ArrayList<String> parts = new ArrayList<>();

    Car(String brands) {
        this.brands = brands;
    }

    void addPart(String part) {
        parts.add(part);
    }

    void show() {
        StringBuilder stringBuilder = new StringBuilder("我是一辆安装了");
        for (String part : parts) {
            stringBuilder.append(part + " ");
        }
        stringBuilder.append("的");
        stringBuilder.append(brands);
        stringBuilder.append("车");
        System.out.println(stringBuilder);
    }
}
