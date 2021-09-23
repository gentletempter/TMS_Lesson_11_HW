package task1.thread;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * This class solve to generate array with random integer values from 1 to 999
 */
public class ThreadFileGenerator extends Thread {

    @Override
    public void run() {
        writeFile(randomArrayGenerator());
    }

    public ThreadFileGenerator(String name) {
        super(name);
    }

    private static int[] randomArrayGenerator() {
        int[] arrayInt = new int[10];
        for (int i = 0; i < 10; i++) {
            arrayInt[i] = (int) (Math.random() * 100);
        }
        System.out.println(ThreadFileGenerator.currentThread().getName() + ": " + Arrays.toString(arrayInt));
        return arrayInt;
    }

    private static synchronized void writeFile(int[] arrayInt) {

        File reportFile = new File("./src/task1/report.txt");
        try {
            if (!reportFile.exists()) {
                reportFile.createNewFile();
            }
        } catch (Exception ex) {
            System.out.println("Failed to create file");
        }
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reportFile))) {
            fileWriter.append(Arrays.toString(arrayInt));
        } catch (IOException ex) {
            System.out.println("File not found");
        }
    }
}
