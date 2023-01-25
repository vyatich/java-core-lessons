package ru.top.practic.concurrent.practice7;

import java.io.*;

public class ReaderThread extends Thread {

    private final Object lock;
    private final File file;

    public ReaderThread(Object lock, File file) {
        this.lock = lock;
        this.file = file;
    }

    @Override
    public void run() {
        synchronized (lock) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    Main.currentLine = line;
                    lock.notifyAll();
                    lock.wait();
                }
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
