package Observer;

/**
 * author：heng.zhang
 * date：2018/5/30
 * description：通知者
 */
class School extends Subject{
    private String state;

    protected void setState(String state) {
        this.state = state;
        notifyObserver();
    }

    protected String getState() {
        return state;
    }
}
