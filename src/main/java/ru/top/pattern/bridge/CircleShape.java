package ru.top.pattern.bridge;

public class CircleShape extends Shape {

    public CircleShape(Fillable fillable) {
        super(fillable);
    }

    @Override
    public String draw() {
        return String.format("Draw %s with %s", this.getClass().getSimpleName(), fillable.fill());
    }
}
