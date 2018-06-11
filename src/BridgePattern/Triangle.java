package BridgePattern;

/**
 * author：heng.zhang
 * date：2018/6/11
 * description：提炼的抽象
 */
class Triangle extends Shape{
    @Override
    void drawShape() {
        color.drawColor();
        System.out.printf("三角形");
    }
}
