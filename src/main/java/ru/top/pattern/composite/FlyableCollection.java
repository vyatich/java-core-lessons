package ru.top.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class FlyableCollection implements Flyable {

    private final List<Flyable> flyables;

    public FlyableCollection() {
        this.flyables = new ArrayList<>();
    }

    @Override
    public void fly() {
        flyables.forEach(Flyable::fly);
    }

    public void addFlyable(Flyable flyable) {
        flyables.add(flyable);
    }

    public void deleteFlyable(Flyable flyable) {
        flyables.remove(flyable);
    }
}
