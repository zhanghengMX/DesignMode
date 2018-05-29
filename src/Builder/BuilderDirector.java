package Builder;

/**
 * author：heng.zhang
 * date：2018/5/29
 * description：
 */
class BuilderDirector {
    void createCar(Builder builder) {
        builder.installShell();
        builder.installEngine();
        builder.installTires();
        builder.installInterior();
    }
}
