package ru.top.pattern.builder;

import ru.top.pattern.abstractFactory.Computer;

public abstract class AbstractBuilder {

    protected Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public abstract void buildProcessor();
    public abstract void buildMotherBoard();
    public abstract void buildMemory();
    public abstract void buildHardDisk();
}
