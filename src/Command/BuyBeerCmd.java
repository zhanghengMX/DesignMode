package Command;

/**
 * author：heng.zhang
 * date：2018/6/12
 * description：
 */
class BuyBeerCmd extends Command{
    private DrinkSaler drinkSaler;

    BuyBeerCmd(DrinkSaler drinkSaler) {
        this.drinkSaler = drinkSaler;
    }

    @Override
    public void executeCommand() {
        drinkSaler.saleBeer();
        this.finished = true;
    }
}
