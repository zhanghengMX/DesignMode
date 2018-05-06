package Strategy;

import java.util.HashMap;

/**
 * author：heng.zhang
 * date：2018/5/6
 * description：
 */
public class StrategyContext {
    public static final String STRATEGY_TYPE_DISCOUNT = "strategy_type_discount";
    public static final String STRATEGY_TYPE_FULL_REDUCTION = "strategy_type_full_reduction";

    private SaleStrategy strategy;

    public StrategyContext(String type, HashMap<String, Float> args) {
        switch (type) {
            case STRATEGY_TYPE_DISCOUNT:
                if (args != null)
                    strategy = new Discount(args.get("discount"));
                break;
            case STRATEGY_TYPE_FULL_REDUCTION:
                if (args != null)
                    strategy = new FullReduction(args.get("fullPrice"), args.get("reductionPrice"));
                break;
        }
    }

    float execStrategy(float price) {
        if (strategy != null) {
            return strategy.execStrategy(price);
        }
        return price;
    }
}
