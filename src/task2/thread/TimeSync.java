package task2.thread;

import static java.lang.Thread.currentThread;

/**
 * Using for print current time and name of thread
 */
public class TimeSync {

    public static synchronized void getTimeSync() {
        System.out.println(currentThread().getName() + ": " + java.time.LocalTime.now());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
