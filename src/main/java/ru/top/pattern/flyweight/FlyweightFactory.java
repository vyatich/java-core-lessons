package ru.top.pattern.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static final Map<Color, Transoprt> transportMap = new HashMap<>();

    private FlyweightFactory() {
    }

    public static Transoprt createTransport(Color color) {
        return transportMap.computeIfAbsent(color, newColor -> new Car(newColor, new Engine()));
    }
}
