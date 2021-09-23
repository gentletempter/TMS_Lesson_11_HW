package task3.model;

import java.util.LinkedList;

/**
 * Represents a kind of storage
 */
public class Store {
    private final int MAX_CAPACITY = 10;
    public static LinkedList<Integer> store = new LinkedList<>();

    public synchronized void put() {
        while (store.size() > MAX_CAPACITY - 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            store.add((int) (Math.random() * 100));
            System.out.println("+Add 1 item to store");
            System.out.println("Items in store: " + store.size());
            notify();
    }

    public synchronized void get() {
        while (store.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        store.removeFirst();
        System.out.println("-Remove 1 item from store");
        System.out.println("Items in store: " + store.size());
        notify();
    }
}
