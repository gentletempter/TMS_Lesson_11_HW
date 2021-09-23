package task0;

import task0.thread.ThreadGenerator;

public class Runner {
    public static void runTask0() {
        for (int i = 1; i <= 10; i++) {
            new ThreadGenerator("My thread " + i).start();
        }
    }
}
