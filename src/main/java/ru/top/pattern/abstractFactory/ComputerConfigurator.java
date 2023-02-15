package ru.top.pattern.abstractFactory;

public class ComputerConfigurator {

    public static void configure(Computer computer, ComputerFactory computerFactory) {
        computer.setHardDisk(computerFactory.createHardDisk());
        computer.setMemory(computerFactory.createMemory());
        computer.setMotherBoard(computerFactory.createMotherBoard());
        computer.setProcessor(computerFactory.createProcessor());
    }
}
