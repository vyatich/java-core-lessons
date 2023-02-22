package ru.top.pattern.bridge;

public class Main {

    public static void main(String[] args) {
        Shape circleShape = getShape();
        System.out.println(circleShape.draw());
    }

    public static Shape getShape() {
        return new CircleShape(new RedFill());
    }
}
