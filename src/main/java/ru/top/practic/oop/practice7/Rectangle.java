package ru.top.practic.oop.practice7;

public class Rectangle extends Figure {

    private final Double width;
    private final Double height;

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Double getSquare() {
        return width * height;
    }
}
