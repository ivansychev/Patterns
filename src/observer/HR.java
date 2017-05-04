package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivans on 04/05/2017.
 */
public class HR implements Observable {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        observers.forEach(x->x.message("have a new job"));
    }
}
