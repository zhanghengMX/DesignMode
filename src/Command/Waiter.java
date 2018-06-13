package Command;

import java.util.ArrayList;

/**
 * author：heng.zhang
 * date：2018/6/12
 * description：要求命令执行，管理命令
 */
class Waiter {
    private ArrayList<Command> commands = new ArrayList<>();

    public void addOrder(Command command) {
        commands.add(command);
    }

    void cancelOrder(Command command) {
        if (command.finished) {
            System.out.println("已经做好了，不能取消");
        } else {
            commands.remove(command);
        }
    }
    void commitOrder() {
        for (Command cmd : commands) {
            cmd.executeCommand();
        }
    }
}
