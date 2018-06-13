package Command;

/**
 * author：heng.zhang
 * date：2018/6/12
 * description：
 */
abstract class Command {
    boolean finished = false;
    abstract void executeCommand();
}
