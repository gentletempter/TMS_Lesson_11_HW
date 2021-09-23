package task2;

import task2.thread.MyThread;

public class Runner {
    public static void runTask2() {
        for (int i = 0; i < 10; i++) {
            new MyThread().start();
        }
    }
}
