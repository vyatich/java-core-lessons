package ru.top.practic.concurrent.practice7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterThread extends Thread {

    private final Object lock;

    public WriterThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        File file = new File("D:\\JProjects\\java214\\java-core\\example_directory\\run\\skip\\java\\"
                + Thread.currentThread().getName() + ".txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        synchronized (lock) {
            try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
                while (!Main.currentLine.equals("")) {
                    lock.wait();
                    bufferedWriter.write(Main.currentLine + "\n");
                    bufferedWriter.flush();
                    lock.notifyAll();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
