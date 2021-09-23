package task4.thread;

/**
 * My custom thread. Print the number of seconds than slept then starts
 */
public class MyThread extends Thread {
    int sleepTime;

    public MyThread(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        try2Sleep(sleepTime);
    }

    private void try2Sleep(int sleepTime) {
        try {
            sleep(sleepTime * 1000);
            System.out.println("I slept for " + sleepTime + " seconds");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
