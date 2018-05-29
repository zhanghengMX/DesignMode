package Builder;

/**
 * author：heng.zhang
 * date：2018/5/29
 * description：构建类公共接口
 */
abstract class Builder {
    abstract void installShell();
    abstract void installEngine();
    abstract void installTires();
    abstract void installInterior();
    abstract Car getResult();
}
