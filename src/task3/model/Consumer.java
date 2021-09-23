package task3.model;

import static java.lang.Thread.sleep;

/**
 * Reads numbers endlessly with some random delay (0 to 10ms)
 */
public class Consumer implements Runnable {
    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    private void consume() {
        while (true) {
            try {
                sleep((int) (Math.random() * 10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            store.get();
        }
    }

    @Override
    public void run() {
        consume();
    }
}
