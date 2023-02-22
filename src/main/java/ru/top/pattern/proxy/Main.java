package ru.top.pattern.proxy;

public class Main {

    public static void main(String[] args) {
        Draw draw = new DrawProxy();
        draw.draw();
        draw.draw();
    }
}
