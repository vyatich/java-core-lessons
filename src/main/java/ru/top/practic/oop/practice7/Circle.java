package ru.top.practic.oop.practice7;

public class Circle extends Figure {

    private final Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }
}
