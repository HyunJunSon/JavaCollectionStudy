package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {
    private List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObserver(){

        observerList.forEach(ob -> ob.update(this));
    }

    public abstract int getNumber();
    public abstract void execute();
}
