package Command;

/**
 * author：heng.zhang
 * date：2018/6/12
 * description：
 */
class BakeChickenWingCmd extends Command {
    private Barbecuer barbecuer;

    BakeChickenWingCmd(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    @Override
    public void executeCommand() {
        barbecuer.bakeChickenWing();
        this.finished = true;
    }
}
