package ru.top.pattern.abstractFactory;

import ru.top.pattern.abstractFactory.parts.HardDisk;
import ru.top.pattern.abstractFactory.parts.Memory;
import ru.top.pattern.abstractFactory.parts.impl.HighMemory;
import ru.top.pattern.abstractFactory.parts.impl.Ssd;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String computerType = scanner.nextLine();

        Computer computer = new Computer();
        ComputerFactory computerFactory = null;
        switch (computerType) {
            case "игровой":
                computerFactory = new GameComputerFactory();
                break;
            case "офисный":
                computerFactory = new OfficeComputerFactory();
                break;
        }
        ComputerConfigurator.configure(computer, computerFactory);

        System.out.println(computer);
    }
}
