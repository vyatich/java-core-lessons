package ru.top.pattern.builder;

import ru.top.pattern.abstractFactory.Computer;
import ru.top.pattern.abstractFactory.parts.impl.BadMotherBoard;
import ru.top.pattern.abstractFactory.parts.impl.BadProcessor;
import ru.top.pattern.abstractFactory.parts.impl.Hdd;
import ru.top.pattern.abstractFactory.parts.impl.LowMemory;

public class OfficeComputerBuilder extends AbstractBuilder {

    public OfficeComputerBuilder() {
        computer = new Computer();
        computer.setType("Office");
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor(new BadProcessor());
    }

    @Override
    public void buildMotherBoard() {
        computer.setMotherBoard(new BadMotherBoard());
    }

    @Override
    public void buildMemory() {
        computer.setMemory(new LowMemory());
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk(new Hdd());
    }
}
