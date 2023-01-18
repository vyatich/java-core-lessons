package ru.top.multithreading;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            if (!isInterrupted()) {
                System.out.println(Thread.currentThread().getName() + " " + ThreadExample.count);
                ThreadExample.count.incrementAndGet();
                System.out.println(Thread.currentThread().getName() + " " + ThreadExample.count);
            }
        }
    }
}
