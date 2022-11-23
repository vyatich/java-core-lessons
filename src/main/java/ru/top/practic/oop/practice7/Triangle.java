package ru.top.practic.oop.practice7;

public class Triangle extends Figure {

    private final Double firstKatet;
    private final Double secondKatet;

    public Triangle(Double firstKatet, Double secondKatet) {
        this.firstKatet = firstKatet;
        this.secondKatet = secondKatet;
    }

    @Override
    public Double getSquare() {
        return firstKatet * secondKatet / 2;
    }
}
