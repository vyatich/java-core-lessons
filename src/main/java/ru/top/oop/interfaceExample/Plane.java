package ru.top.oop.interfaceExample;

public class Plane extends AbstractDevice implements Flyable {

    @Override
    public void print() {
        System.out.println(Flyable.PATH);
    }

    @Override
    public void printHelloWorld() {
        System.out.println("It's plane");
    }
}
