package ru.top.pattern.facade;

public class Computer {

    private final MotherBoard motherBoard;
    private final HardDrive hardDrive;
    private final Memory memory;

    private final PowerBlock powerBlock;

    public Computer(MotherBoard motherBoard, HardDrive hardDrive, Memory memory, PowerBlock powerBlock) {
        this.motherBoard = motherBoard;
        this.hardDrive = hardDrive;
        this.memory = memory;
        this.powerBlock = powerBlock;
    }

    public void start() throws InterruptedException {
        powerBlock.start();
        motherBoard.start();
        memory.start();
        hardDrive.start();
    }
}
