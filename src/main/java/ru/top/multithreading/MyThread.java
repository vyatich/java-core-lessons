package ru.top.multithreading;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 50000; i++) {
            if (!isInterrupted()) {
                synchronized(MyThread.class) {
                    ThreadExample.count++;
                }
            }
        }
    }
}
