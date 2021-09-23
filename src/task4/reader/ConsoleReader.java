package task4.reader;

import task4.thread.MyThread;

import java.util.Scanner;

/**
 * This reader works while console input not equals -1
 */
public class ConsoleReader {
    public static void consoleReader() {
        Scanner sc = new Scanner(System.in);
        try {
            int sTime = sc.nextInt();
            while (sTime != -1) {
                new MyThread(sTime).start();
                sTime = sc.nextInt();
            }
        } catch (Exception ex) {
            System.out.println("Invalid input data");
        }
    }
}
