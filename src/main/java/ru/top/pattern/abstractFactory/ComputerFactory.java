package ru.top.pattern.abstractFactory;

import ru.top.pattern.abstractFactory.parts.HardDisk;
import ru.top.pattern.abstractFactory.parts.Memory;
import ru.top.pattern.abstractFactory.parts.MotherBoard;
import ru.top.pattern.abstractFactory.parts.Processor;

public interface ComputerFactory {

    Processor createProcessor();

    MotherBoard createMotherBoard();

    Memory createMemory();

    HardDisk createHardDisk();
}
