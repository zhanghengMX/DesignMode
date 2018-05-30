package Observer;

/**
 * author：heng.zhang
 * date：2018/5/30
 * description：具体观察者类
 */
class Teacher extends Observer{
    private School school;
    public Teacher(School school) {
        this.school = school;
    }

    @Override
    void responseNotify() {
        if("放假".equals(school.getState())) {
            System.out.println("回家休息");
        } else if("上课".equals(school.getState())) {
            System.out.println("准备课件");
        }
    }
}
