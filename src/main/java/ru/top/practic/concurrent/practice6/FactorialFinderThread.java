package ru.top.practic.concurrent.practice6;

import java.io.*;
import java.math.BigInteger;

public class FactorialFinderThread extends Thread {

    private final File sourceFile;

    public FactorialFinderThread(File sourceFile) {
        this.sourceFile = sourceFile;
    }

    @Override
    public void run() {
        File writeFile = new File("D:\\JProjects\\java214\\java-core\\example_directory\\run\\skip\\java\\"
                + Thread.currentThread().getName() + ".txt");
        createNewFileIfNotExist(writeFile);

        synchronized (Main.lock) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile));
                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(writeFile))) {

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    Integer originalNumber = Integer.valueOf(line);
                    if (originalNumber > 0) {
                        bufferedWriter.write(getFactotial(new BigInteger(originalNumber.toString())) + "\n");
                    }
                }
                bufferedWriter.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private BigInteger getFactotial(BigInteger number) {
        if (number.equals(new BigInteger("1")) || number.equals(new BigInteger("2"))) {
            return number;
        } else {
            return getFactotial(number.subtract(new BigInteger("1"))).multiply(number);
        }
    }

    private static void createNewFileIfNotExist(File writeFile) {
        if (writeFile.exists()) {
            return;
        }
        try {
            writeFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
