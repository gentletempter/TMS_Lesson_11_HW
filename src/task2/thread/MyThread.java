package task2.thread;

/**
 * Simple custom thread
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        TimeSync timeSync = new TimeSync();
        timeSync.getTimeSync();
    }
}
