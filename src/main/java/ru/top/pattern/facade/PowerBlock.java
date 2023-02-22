package ru.top.pattern.facade;

public class PowerBlock {

    public void start() throws InterruptedException {
        System.out.println("Power block start");
        Thread.sleep(3000);
    }
}
