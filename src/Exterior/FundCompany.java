package Exterior;

/**
 * author：heng.zhang
 * date：2018/5/29
 * description：基金类
 */
class FundCompany {

    void buyFundA() {
        new FundA().buy();
    }

    void buyFundB() {
        new FundB().buy();
    }

    void buyFundC() {
        new FundC().buy();
    }
    private class FundA {
        void buy() {
            new StockA().buy();
            new StockB().buy();
            new StockC().buy();
        }
    }

    private class FundB {
        void buy() {
            new StockA().buy();
            new StockC().buy();
        }
    }

    private class FundC {
        void buy() {
            new StockA().buy();
            new StockD().buy();
        }
    }
}
