package Builder;

/**
 * author：heng.zhang
 * date：2018/5/29
 * description：客户端
 */
class Client {
    public static void main(String[] args) {
        BuilderDirector director = new BuilderDirector();

        BMWBuilder builder = new BMWBuilder();
        director.createCar(builder);
        Car BWMcar = builder.getResult();
        BWMcar.show();

        AudiBuilder audiBuilder = new AudiBuilder();
        director.createCar(audiBuilder);
        Car audiCar = audiBuilder.getResult();
        audiCar.show();
    }
}
