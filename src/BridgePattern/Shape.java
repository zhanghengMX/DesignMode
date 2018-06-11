package BridgePattern;

/**
 * author：heng.zhang
 * date：2018/6/11
 * description：抽象
 */
abstract class Shape {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    abstract void drawShape();
}
