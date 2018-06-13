package Command;

/**
 * author：heng.zhang
 * date：2018/6/12
 * description：
 */
class Client {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Barbecuer barbecuer = new Barbecuer();
        DrinkSaler drinkSaler = new DrinkSaler();

        BakeChickenWingCmd bakeChickenWingCmd = new BakeChickenWingCmd(barbecuer);
        BakeCornCmd bakeCornCmd = new BakeCornCmd(barbecuer);
        BakeMuttonCmd bakeMuttonCmd = new BakeMuttonCmd(barbecuer);
        BuyBeerCmd buyBeerCmd = new BuyBeerCmd(drinkSaler);

        waiter.addOrder(bakeChickenWingCmd);
        waiter.addOrder(bakeCornCmd);
        waiter.addOrder(bakeMuttonCmd);
        waiter.addOrder(buyBeerCmd);

        waiter.cancelOrder(bakeCornCmd);
        waiter.commitOrder();
    }
}
