package ru.top.multithreading;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

public class ExecutorExample {

    private volatile long a;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Runtime.getRuntime().maxMemory());
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        Map<Integer, Callable<?>> futureMap = new HashMap<>();
        futureMap.put(1, () -> {
            try {
                Thread.currentThread().wait();
                System.out.println(Thread.currentThread().getName());
                return 2;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        futureMap.put(2, () -> {
            System.out.println(Thread.currentThread().getName());
            return 2;
        });
        Future<?> result1 = executorService.submit(futureMap.get(1));
        Future<?> result2 = executorService.submit(futureMap.get(2));

        if (result1.isDone()) {
            System.out.println(result1.get());
        }
        System.out.println(result2.get());

        System.out.println("---------------------");
        executorService.shutdown();
    }
}
