package Adapter.ObjectAdapter;

/**
 * author：heng.zhang
 * date：2018/6/9
 * description：适配器类，将客户端的需求交给被适配的对象实现
 */
class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();
    @Override
    public void newMethod() {
        adaptee.oldMethod();
    }
}
