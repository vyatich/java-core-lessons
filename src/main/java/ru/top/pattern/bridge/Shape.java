package ru.top.pattern.bridge;

public abstract class Shape {

    protected final Fillable fillable;

    public Shape(Fillable fillable) {
        this.fillable = fillable;
    }

    abstract public String draw();
}
