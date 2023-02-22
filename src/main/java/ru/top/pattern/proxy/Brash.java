package ru.top.pattern.proxy;

public class Brash implements Draw {

    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName());
    }
}
