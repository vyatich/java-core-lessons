package ru.top.pattern.builder;

import ru.top.pattern.abstractFactory.Computer;
import ru.top.pattern.abstractFactory.parts.impl.GameProcessor;
import ru.top.pattern.abstractFactory.parts.impl.GoodMotherBoard;
import ru.top.pattern.abstractFactory.parts.impl.HighMemory;
import ru.top.pattern.abstractFactory.parts.impl.Ssd;

public class GameComputerBuilder extends AbstractBuilder {

    public GameComputerBuilder() {
        computer = new Computer();
        computer.setType("Game");
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor(new GameProcessor());
    }

    @Override
    public void buildMotherBoard() {
        computer.setMotherBoard(new GoodMotherBoard());
    }

    @Override
    public void buildMemory() {
        computer.setMemory(new HighMemory());
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk(new Ssd());
    }
}
