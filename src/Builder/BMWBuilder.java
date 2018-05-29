package Builder;

/**
 * author：heng.zhang
 * date：2018/5/29
 * description：具体的构建类
 */
class BMWBuilder extends Builder{
    private Car car = new Car("BMW");

    @Override
    void installShell() {
        car.addPart("白色外壳");
    }

    @Override
    void installEngine() {
        car.addPart("发动机");
    }

    @Override
    void installTires() {
        car.addPart("米其林轮胎");
    }

    @Override
    void installInterior() {
        car.addPart("真皮座椅");
        car.addPart("液晶显示屏");
    }

    @Override
    Car getResult() {
        return car;
    }
}
