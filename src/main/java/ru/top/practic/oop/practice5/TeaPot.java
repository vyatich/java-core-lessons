package ru.top.practic.oop.practice5;

public class TeaPot extends Device {

    public TeaPot(String name, Long price) {
        super(name, price);
    }

    @Override
    public void sound() {
        System.out.println("yyyyyyyyy");
    }

    @Override
    public void show() {
        System.out.println(name);
    }

    @Override
    public void desc() {
        System.out.println(this);
    }
}
