package TemplateMethod;

/**
 * author：heng.zhang
 * date：2018/5/9
 * description：
 */
class CookVegetables extends Cooking {
    @Override
    void putFood() {
        System.out.println("放入蔬菜");
    }
}
