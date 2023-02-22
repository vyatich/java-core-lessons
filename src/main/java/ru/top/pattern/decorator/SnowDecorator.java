package ru.top.pattern.decorator;

public class SnowDecorator extends Decorator {

    public SnowDecorator(Decoratable decoratable) {
        super(decoratable);
    }

    @Override
    public String decorate() {
        return super.decorate() + " add snow";
    }
}
