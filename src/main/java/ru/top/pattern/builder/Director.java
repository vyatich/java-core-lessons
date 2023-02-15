package ru.top.pattern.builder;

import ru.top.pattern.abstractFactory.Computer;

public class Director {

    public static Computer build(AbstractBuilder abstractBuilder) {
        abstractBuilder.buildMotherBoard();
        abstractBuilder.buildProcessor();
        abstractBuilder.buildHardDisk();
        abstractBuilder.buildMemory();
        return abstractBuilder.computer;
    }
}
