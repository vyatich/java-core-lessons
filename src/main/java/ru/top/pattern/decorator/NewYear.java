package ru.top.pattern.decorator;

public class NewYear implements Decoratable {

    @Override
    public String decorate() {
        return "New Year decorate";
    }
}
