package ru.top.practic.javatypes;

import java.util.Scanner;

public class Practic4 {

    //Напишите программу, вычисляющую площадь треугольника. Пользователь с клавиатуры вводит размер
    //основания треугольника и размер высоты
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый катет");
        int firstKatet = scanner.nextInt();
        System.out.println("Введите второй катет");
        int secondKatet = scanner.nextInt();
        System.out.println(0.5 * firstKatet * secondKatet);
    }
}
