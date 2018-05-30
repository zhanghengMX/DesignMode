package Observer;

/**
 * author：heng.zhang
 * date：2018/5/30
 * description：具体观察者类
 */
class Student extends Observer{
    private School school;
    Student(School school) {
        this.school = school;
    }

    @Override
    void responseNotify() {
        if("放假".equals(school.getState())) {
            System.out.println("回家打游戏了哦");
        } else if("上课".equals(school.getState())) {
            System.out.println("哎，又上课了");
        }
    }
}
