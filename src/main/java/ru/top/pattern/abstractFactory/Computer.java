package ru.top.pattern.abstractFactory;

import ru.top.pattern.abstractFactory.parts.HardDisk;
import ru.top.pattern.abstractFactory.parts.Memory;
import ru.top.pattern.abstractFactory.parts.MotherBoard;
import ru.top.pattern.abstractFactory.parts.Processor;

public class Computer {

    private String type;
    private Processor processor;
    private MotherBoard motherBoard;
    private Memory memory;
    private HardDisk hardDisk;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    @Override
    public String toString() {
        String sb = "Computer{" + "type='" + type + '\'' +
                ", processor=" + processor +
                ", motherBoard=" + motherBoard +
                ", memory=" + memory +
                ", hardDisk=" + hardDisk +
                '}';
        return sb;
    }
}
