package Exterior;

/**
 * author：heng.zhang
 * date：2018/5/29
 * description：
 */
public class Client {
    public static void main(String[] args) {
        FundCompany fundCompany = new FundCompany();

        fundCompany.buyFundA();
        System.out.println("****************************************");

        fundCompany.buyFundB();
        System.out.println("****************************************");

        fundCompany.buyFundC();
        System.out.println("****************************************");
    }
}
