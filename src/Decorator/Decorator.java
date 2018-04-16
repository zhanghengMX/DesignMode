package Decorator;

/**
 * author：heng.zhang
 * date：2018/4/16
 * description：装饰者基类
 */
public class Decorator extends PlayRole {
    protected PlayRole playRole;

    public void setPlayRole(PlayRole playRole) {
        this.playRole = playRole;
    }

    @Override
    public void descMySelf() {
        playRole.descMySelf();
    }
}
