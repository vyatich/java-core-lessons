package ru.top.pattern.composite;

public class Airplane implements Flyable {

    private Long id;
    private String model;

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName());
    }
}
