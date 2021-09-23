package task3.model;

/**
 * Adds random numbers to the list infinitely, but the maximum number he can add is 10
 */
public class Producer implements Runnable {
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    private void produce() {
        while (true) {
            store.put();
        }
    }

    @Override
    public void run() {
        produce();
    }
}
