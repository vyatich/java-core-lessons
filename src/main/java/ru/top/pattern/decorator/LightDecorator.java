package ru.top.pattern.decorator;

public class LightDecorator extends Decorator {

    public LightDecorator(Decoratable decoratable) {
        super(decoratable);
    }

    @Override
    public String decorate() {
        return super.decorate() + getLight();
    }

    private static String getLight() {
        return " and add light";
    }
}
