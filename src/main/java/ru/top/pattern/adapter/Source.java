package ru.top.pattern.adapter;

public class Source implements SourceInterface {

    private final int WIDTH = 4;

    @Override
    public int getWidth() {
        return WIDTH;
    }
}
