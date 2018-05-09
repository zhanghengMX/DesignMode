package TemplateMethod;

/**
 * author：heng.zhang
 * date：2018/5/9
 * description：
 */
class Client {
    public static void main(String[] args) {
        Cooking cookVegetables = new CookVegetables();
        cookVegetables.cook();

        Cooking cookBeef = new CookBeef();
        cookBeef.cook();
    }
}
