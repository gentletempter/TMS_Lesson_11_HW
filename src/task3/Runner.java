package task3;

import task3.model.Consumer;
import task3.model.Producer;
import task3.model.Store;

public class Runner {
    public static void runTask3() {
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer1 = new Consumer(store);
        Consumer consumer2 = new Consumer(store);
        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();
    }
}
