package ru.top.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadExample {

    static Integer count = 0;

    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();

        MyThread thread2 = new MyThread();
        thread2.start();

        RunnableExample runnableExample = new RunnableExample();
        Thread thread1 = new Thread(runnableExample);
        thread1.start();

        System.out.println(thread2.isAlive());
        thread1.join();
        thread.join();
        thread2.join();
        System.out.println(thread2.isAlive());

        //100000, 50000
        System.out.println(count);
    }
}
