package observer;

/**
 * Created by ivans on 04/05/2017.
 */
public class Main {
    public static void main(String[] args) {
        HR hr = new HR();
        Worker worker1 = new Worker(1);
        Worker worker2 = new Worker(2);

        hr.registerObserver(worker1);
        hr.registerObserver(worker2);

        hr.notifyAllObservers();
    }
}
