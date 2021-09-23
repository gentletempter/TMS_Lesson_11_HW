package task0.thread;

import java.util.Arrays;

/**
 * Simple custom thread using random int array
 */
public class ThreadGenerator extends Thread {
    public ThreadGenerator(String name) {
        super(name);
    }

    @Override
    public void run() {
        int[] intArray = new int[10];
        for (int i = 0; i < 10; i++) {
            intArray[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(intArray);
        System.out.println(ThreadGenerator.currentThread().getName() + ": " + intArray[9]);
    }
}
