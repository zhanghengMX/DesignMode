package Strategy;

import java.util.HashMap;

/**
 * author：heng.zhang
 * date：2018/5/6
 * description：
 */
public class Client {
    public static void main(String[] args) {
        HashMap<String ,Float> discountArgs = new HashMap<>();
        discountArgs.put("discount", null);
        StrategyContext context = new StrategyContext(StrategyContext.STRATEGY_TYPE_DISCOUNT, discountArgs);
        float result = context.execStrategy(100f);
        System.out.println("打折的价格: " + result);

        HashMap<String ,Float> fullReductionArgs = new HashMap<>();
        fullReductionArgs.put("fullPrice", 300f);
        fullReductionArgs.put("reductionPrice", 120f);
        StrategyContext context2 = new StrategyContext(StrategyContext.STRATEGY_TYPE_FULL_REDUCTION, fullReductionArgs);
        float result2 = context2.execStrategy(400f);
        System.out.println("满减的价格: " + result2);
    }
}
