package ru.top.multithreading.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExampleMain {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);

        Lock lock = new ReentrantLock();

        for (int i = 0; i < 100; i++) {
            service.submit(new LockExample(lock));
        }
    }
}
