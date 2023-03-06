package ru.top.practic.review;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class Main {

    static List<Thread> threads = new ArrayList<>();
    static volatile long count;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            Thread thread =
                    new Thread(
                            () -> {
                                for (int j = 0; j < 1000; j++) {
                                    count++;
                                }
                            });
            thread.start();
            threads.add(thread);
        }

        threads.forEach(
                t -> {
                    try {
                        t.join();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });

        System.out.println(count);
    }
}
