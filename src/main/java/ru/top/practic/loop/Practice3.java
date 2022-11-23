package ru.top.practic.loop;

import java.util.Scanner;

public class Practice3 {

    //Задание 3
    //Пользователь вводит с клавиатуры два числа. Нужно показать все нечетные числа в указанном диапазоне.
    //Если границы диапазона указаны неправильно требуется
    //произвести нормализацию границ. Например, пользователь ввел 20 и 11, требуется нормализация после которой
    //начало диапазона станет равно 11, а конец 20.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = scanner.nextInt();
        int endNumber = scanner.nextInt();

        int correctedStartNumber = startNumber;
        int correctedEndNumber = endNumber;
        if (startNumber > endNumber) {
            correctedStartNumber = endNumber;
            correctedEndNumber = startNumber;
        }

        for (int currentNumber = correctedStartNumber; currentNumber < correctedEndNumber; currentNumber++) {
             if (currentNumber % 2 != 0) {
                 System.out.println(currentNumber);
             }
        }
    }
}
