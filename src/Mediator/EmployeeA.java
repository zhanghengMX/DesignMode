package Mediator;

/**
 * author：heng.zhang
 * date：2018/6/20
 * description：
 */
class EmployeeA extends Employee{

    public EmployeeA(Manager manager) {
        this.manager = manager;
    }

    @Override
    void sendMsg(String msg) {
        manager.dealMsg(msg, this);
    }

    @Override
    void notifyMsg(String msg) {
        System.out.println("EmployeeA 接收到消息： " + msg);
    }
}
