package ru.top.practic.concurrent.practice7;

import java.io.File;

public class Main {

    public static String currentLine;

    public static void main(String[] args) throws InterruptedException {
        File file = new File("D:\\JProjects\\java214\\java-core\\example_directory\\run\\skip\\java\\"
                + Thread.currentThread().getName() + ".txt");

        Object lock = new Object();

        WriterThread writerThread = new WriterThread(lock);
        writerThread.setDaemon(true);
        writerThread.start();

        ReaderThread readerThread = new ReaderThread(lock, file);
        readerThread.start();
    }
}
