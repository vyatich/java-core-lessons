package ru.top.practic.concurrent.practice6;

import java.io.*;

public class SimpleNumbersFinderThread extends Thread {

    private final File file;

    public SimpleNumbersFinderThread(File file) {
        this.file = file;
    }

    @Override
    public void run() {
        File writeFile = new File("D:\\JProjects\\java214\\java-core\\example_directory\\run\\skip\\java\\"
                + Thread.currentThread().getName() + ".txt");
        try {
            writeFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        synchronized (Main.lock) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(writeFile))) {

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    Integer originalNumber = Integer.valueOf(line);
                    Integer absNumber = Math.abs(originalNumber);
                    if (isSimple(absNumber)) {
                        bufferedWriter.write(originalNumber + "\n");
                    }
                }
                bufferedWriter.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static boolean isSimple(Integer number) {
        for (int delimiter = 2; delimiter < number / 2; delimiter++) {
            if (number % delimiter == 0) {
                return false;
            }
        }
        return true;
    }
}
