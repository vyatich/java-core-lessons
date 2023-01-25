package ru.top.multithreading.semaphore;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            SemaphoreExample semaphoreExample = new SemaphoreExample();
            semaphoreExample.start();
        }
        //A(1) happens-before B(2)
        //B happens-before C
        //A happens-before C
    }
}
