package ru.top.pattern.decorator;

public class Main {

    public static void main(String[] args) {
        Decoratable decoratable = new LightDecorator(new NewYear());
        System.out.println(decoratable.decorate());

        Decoratable decoratable1 = new TreeDecorator(decoratable);
        System.out.println(decoratable1.decorate());
    }
}
