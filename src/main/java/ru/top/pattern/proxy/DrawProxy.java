package ru.top.pattern.proxy;

public class DrawProxy implements Draw {

    private static Draw draw;

    @Override
    public void draw() {
        if (draw == null) {
            draw = new Brash();
        }
        draw.draw();
    }
}
