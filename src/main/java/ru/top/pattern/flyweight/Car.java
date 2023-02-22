package ru.top.pattern.flyweight;

import java.awt.*;

public class Car implements Transoprt {

    private final Color color;
    private final Engine engine;

    public Car(Color color, Engine engine) {
        this.color = color;
        this.engine = engine;
    }

    @Override
    public void start() {
        System.out.println("Car start");
        engine.start();
    }

    @Override
    public void stop() {
        System.out.println("Car stop");
        engine.stop();
    }

    @Override
    public Color getColor() {
        return this.color;
    }
}
