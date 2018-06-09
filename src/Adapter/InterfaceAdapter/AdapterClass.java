package Adapter.InterfaceAdapter;

/**
 * author：heng.zhang
 * date：2018/6/9
 * description：适配器类，实现部分方法，只保留客户端想实现的方法为抽象方法
 */
abstract class AdapterClass implements OldInterface{
    @Override
    public void methodA() {

    }

    public abstract void methodB();

    @Override
    public void methodC() {

    }

    public abstract void methodD();
}
