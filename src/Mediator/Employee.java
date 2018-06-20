package Mediator;

/**
 * author：heng.zhang
 * date：2018/6/20
 * description：员工抽象类
 */
abstract class Employee {
    Manager manager;
    abstract void sendMsg(String msg);
    abstract void notifyMsg(String msg);
}
