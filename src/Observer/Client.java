package Observer;

/**
 * author：heng.zhang
 * date：2018/5/30
 * description：测试客户端
 */
class Client {
    public static void main(String[] args) {
        School school = new School();
        school.addObserver(new Student(school));
        school.addObserver(new Teacher(school));

        school.setState("放假");
    }
}
