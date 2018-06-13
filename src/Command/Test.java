package Command;

import java.util.ArrayList;

/**
 * author：heng.zhang
 * date：2018/6/12
 * description：
 */
public class Test {
    public static void main(String[] args) {
        Man A = new Man("A");
        Man B = new Man("B");
        Man C = new Man("C");

        ArrayList<Man> mans = new ArrayList<>();
        mans.add(A);
        mans.add(B);
        mans.add(C);
        mans.add(A);

        mans.remove(A);

        mans.size();
    }

    static class Man{
        private String name;
        public Man(String name) {
            this.name = name;
        }
    }

}
