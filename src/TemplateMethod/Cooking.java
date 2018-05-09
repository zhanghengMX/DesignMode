package TemplateMethod;

/**
 * author：heng.zhang
 * date：2018/5/9
 * description：
 */
abstract class Cooking {
    void cook() {
        putOil();
        putFood();
        putSeasoning();
    }

   private void putOil() {
        System.out.println("放油");
    }

    abstract void putFood();

   private void putSeasoning() {
        System.out.println("放调料");
    }
}
