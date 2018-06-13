package ChainOfResponsibility;

/**
 * author：heng.zhang
 * date：2018/6/13
 * description：处理请求的抽象类
 */
abstract class Manager {
    private Manager nextManager; //下一个处理者

    public void setNextManage(Manager nextManager) {
        this.nextManager = nextManager;
    }
    public Manager getNextManage() {
        return nextManager;
    }
    abstract void handleRequest(Request request);
}
