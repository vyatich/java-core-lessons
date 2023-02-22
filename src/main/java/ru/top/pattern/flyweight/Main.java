package ru.top.pattern.flyweight;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Transoprt transport1 = FlyweightFactory.createTransport(Color.BLACK);

        transport1.start();

        Transoprt transport2 = FlyweightFactory.createTransport(Color.BLACK);

        transport2.start();
    }
}
