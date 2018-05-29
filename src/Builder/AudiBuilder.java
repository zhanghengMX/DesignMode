package Builder;

/**
 * author：heng.zhang
 * date：2018/5/29
 * description：具体的构建类
 */
class AudiBuilder extends Builder{
    private Car car = new Car("Audi");

    @Override
    void installShell() {
        car.addPart("红色外壳");
    }

    @Override
    void installEngine() {
        car.addPart("发动机");
    }

    @Override
    void installTires() {
        car.addPart("朝阳轮胎");
    }

    @Override
    void installInterior() {
        car.addPart("真皮座椅");
        car.addPart("多功能方向盘");
    }

    @Override
    Car getResult() {
        return car;
    }
}
