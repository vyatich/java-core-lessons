package ru.top.oop.interfaceExample;

import java.io.Serializable;

public interface Flyable extends Serializable, Cloneable {

    String PATH = "text";

    void print();

    default void printHelloWorld() {
        System.out.println("Hello world");
    }
}
