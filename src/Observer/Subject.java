package Observer;

import java.util.ArrayList;

/**
 * author：heng.zhang
 * date：2018/5/30
 * description：通知者抽象类
 */
abstract class Subject {
    private ArrayList<Observer> observers = new ArrayList<>();

    protected void addObserver(Observer observer) {
        observers.add(observer);
    }

    protected void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObserver() {
        for (Observer observer : observers) {
            observer.responseNotify();
        }
    }
}
