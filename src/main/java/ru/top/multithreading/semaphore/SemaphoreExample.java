package ru.top.multithreading.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreExample extends Thread {

    private static final Semaphore semaphore = new Semaphore(2);
    private final ThreadLocal<Integer> count = ThreadLocal.withInitial(() -> 2);

    @Override
    public void run() {
        try {
            semaphore.acquire();
            Integer value = count.get();
            count.set(++value);
            System.out.println(count.get());
            System.out.println("Into thread " + Thread.currentThread().getName() + " semaphore " + semaphore.getQueueLength());
            semaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
