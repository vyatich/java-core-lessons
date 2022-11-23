package ru.top.core;

import java.util.Scanner;

public class JavaTypes {

    static Integer intExample;
    static Double doubleExample;
    static Character charExm;
    private static Boolean booleanExm;

    //camelCase - верблюжий регистр
    //heap - куча, тут хранятся объекты нашей программы, выделяется из ОЗУ, существует на всем протяжении работы программы
    //stack - область памяти, выделяемая под конкретный метод, существует только на протяжении работы метода
    //ctrl + alt + L
    //целочисленные - byte(8 bit), short(16 bit), int(32 bit), long(64 bit) - 0
    //с плавающей точкой - float(32), double(64) - 0.0
    //символьные типы - char(16 bit) - 99, 'c'
    //логический тип - boolean (true, false) - false

    //byte - Byte, short - Short, int - Integer, long - Long
    //float - Float, double - Double
    //char - Character
    //boolean - Boolean
    public static void main(String[] args) {
        int humanAge = 127;
        byte newShort = (byte) humanAge;
        humanAge = 30000;
        System.out.printf("humanAge = %s\n", humanAge);

        Scanner scanner = new Scanner(System.in);
        int newLine = scanner.nextInt();
        String ageString = scanner.nextLine();
        System.out.println(ageString);
        System.out.println(newLine);
    }

    public static void doExample() {
        int integer = 12;
        integer = integer + 10;
        System.out.println(integer);
    }
    //100 -> 0 * 2^0 + 0 * 2^1 + 1 * 2^2 = 0 + 0 + 4 = 4
    //4 / 2 = 2 / 2 = 1
    //0 0 1 = 100
}
