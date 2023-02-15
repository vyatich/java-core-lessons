package ru.top.pattern.builder;

import ru.top.pattern.abstractFactory.Computer;

public class Main {

    public static void main(String[] args) {
        Computer computer = Director.build(new GameComputerBuilder());

        System.out.println(computer);
    }
}
