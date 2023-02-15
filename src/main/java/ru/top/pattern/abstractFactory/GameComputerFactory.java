package ru.top.pattern.abstractFactory;

import ru.top.pattern.abstractFactory.parts.HardDisk;
import ru.top.pattern.abstractFactory.parts.Memory;
import ru.top.pattern.abstractFactory.parts.MotherBoard;
import ru.top.pattern.abstractFactory.parts.Processor;
import ru.top.pattern.abstractFactory.parts.impl.GoodMotherBoard;
import ru.top.pattern.abstractFactory.parts.impl.GameProcessor;
import ru.top.pattern.abstractFactory.parts.impl.HighMemory;
import ru.top.pattern.abstractFactory.parts.impl.Ssd;

public class GameComputerFactory implements ComputerFactory {

    @Override
    public Processor createProcessor() {
        return new GameProcessor();
    }

    @Override
    public MotherBoard createMotherBoard() {
        return new GoodMotherBoard();
    }

    @Override
    public Memory createMemory() {
        return new HighMemory();
    }

    @Override
    public HardDisk createHardDisk() {
        return new Ssd();
    }
}
