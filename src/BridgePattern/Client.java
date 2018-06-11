package BridgePattern;

/**
 * author：heng.zhang
 * date：2018/6/11
 * description：
 */
class Client {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.setColor(new Red());
        circle.drawShape();

        Shape square = new Square();
        square.setColor(new Green());
        square.drawShape();

        Shape triangle = new Triangle();
        triangle.setColor(new Blue());
        triangle.drawShape();
    }
}
