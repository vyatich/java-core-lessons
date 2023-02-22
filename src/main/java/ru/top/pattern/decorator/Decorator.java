package ru.top.pattern.decorator;

public abstract class Decorator implements Decoratable {

    private final Decoratable decoratable;

    public Decorator(Decoratable decoratable) {
        this.decoratable = decoratable;
    }

    @Override
    public String decorate() {
        return decoratable.decorate();
    }
}
