package Command;

/**
 * author：heng.zhang
 * date：2018/6/12
 * description：
 */
class BuyJuiceCmd extends Command{
    private DrinkSaler drinkSaler;

    BuyJuiceCmd(DrinkSaler drinkSaler) {
        this.drinkSaler = drinkSaler;
    }

    @Override
    public void executeCommand() {
        drinkSaler.saleJuice();
        this.finished = true;
    }
}
