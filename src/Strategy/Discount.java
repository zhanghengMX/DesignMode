package Strategy;

/**
 * author：heng.zhang
 * date：2018/5/6
 * description：
 */
public class Discount implements SaleStrategy {
    /**
     * 折扣
     */
    private float discount;

    public Discount(float discount) {
        this.discount = discount;
    }

    @Override
    public float execStrategy(float price) {
        return price * discount;
    }
}
