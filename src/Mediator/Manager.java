package Mediator;

/**
 * author：heng.zhang
 * date：2018/6/20
 * description：中介者抽象类
 */
abstract class Manager {
    abstract void dealMsg(String msg, Employee sender);
}
