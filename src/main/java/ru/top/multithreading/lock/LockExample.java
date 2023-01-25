package ru.top.multithreading.lock;

import java.util.concurrent.locks.Lock;

public class LockExample implements Runnable {

    private final Lock lock;

    public LockExample(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (lock.tryLock()) {
                try {
                    System.out.println(Thread.currentThread().getName());
                } finally {
                    lock.unlock();
                }
            }
        }

    }
}
