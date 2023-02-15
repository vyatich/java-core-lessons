package ru.top.pattern.abstractFactory;

import ru.top.pattern.abstractFactory.parts.HardDisk;
import ru.top.pattern.abstractFactory.parts.Memory;
import ru.top.pattern.abstractFactory.parts.MotherBoard;
import ru.top.pattern.abstractFactory.parts.Processor;
import ru.top.pattern.abstractFactory.parts.impl.BadMotherBoard;
import ru.top.pattern.abstractFactory.parts.impl.BadProcessor;
import ru.top.pattern.abstractFactory.parts.impl.Hdd;
import ru.top.pattern.abstractFactory.parts.impl.LowMemory;

public class OfficeComputerFactory implements ComputerFactory {

    @Override
    public Processor createProcessor() {
        return new BadProcessor();
    }

    @Override
    public MotherBoard createMotherBoard() {
        return new BadMotherBoard();
    }

    @Override
    public Memory createMemory() {
        return new LowMemory();
    }

    @Override
    public HardDisk createHardDisk() {
        return new Hdd();
    }
}
