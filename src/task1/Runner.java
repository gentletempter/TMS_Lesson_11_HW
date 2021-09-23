package task1;

import task1.thread.ThreadFileGenerator;

public class Runner {
    public static void runTask1() {
        Thread fileThread1 = new ThreadFileGenerator("Thread1");
        Thread fileThread2 = new ThreadFileGenerator("Thread2");
        Thread fileThread3 = new ThreadFileGenerator("Thread3");
        fileThread1.start();
        fileThread2.start();
        fileThread3.start();
    }
}
