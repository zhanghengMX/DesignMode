package Strategy;

/**
 * author：heng.zhang
 * date：2018/5/6
 * description：
 */
public class FullReduction implements SaleStrategy {
    private float fullPrice;
    private float reductionPrice;

    public FullReduction(float fullPrice, float reductionPrice) {
        this.fullPrice = fullPrice;
        this.reductionPrice = reductionPrice;
    }

    @Override
    public float execStrategy(float price) {
        if (price > fullPrice) {
            return price - reductionPrice;
        } else {
            return price;
        }
    }
}
