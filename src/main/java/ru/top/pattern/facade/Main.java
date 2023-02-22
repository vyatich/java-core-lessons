package ru.top.pattern.facade;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Computer computer = new Computer(new MotherBoard(), new HardDrive(), new Memory(), new PowerBlock());
        computer.start();
    }
}
