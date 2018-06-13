package Command;

/**
 * author：heng.zhang
 * date：2018/6/12
 * description：
 */
class BakeMuttonCmd extends Command {
    private Barbecuer barbecuer;

    BakeMuttonCmd(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    @Override
    public void executeCommand() {
        barbecuer.bakeMutton();
        this.finished = true;
    }
}
