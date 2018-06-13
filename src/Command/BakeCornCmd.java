package Command;

/**
 * author：heng.zhang
 * date：2018/6/12
 * description：
 */
class BakeCornCmd extends Command {
    private Barbecuer barbecuer;

    BakeCornCmd(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    @Override
    public void executeCommand() {
        barbecuer.bakeCorn();
        this.finished = true;
    }
}
