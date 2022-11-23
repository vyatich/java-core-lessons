package ru.top.practic.loop;

import java.util.Scanner;

public class Practice4 {

    //Задание 4
    //Пользователь вводит с клавиатуры два числа. Нужно
    //посчитать сумму чисел в указанном диапазоне, а также
    //среднеарифметическое.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = scanner.nextInt();
        int endNumber = scanner.nextInt();

        int sum = 0;

        for (int currentNumber = startNumber; currentNumber <= endNumber; currentNumber++) {
            sum += currentNumber;
        }

        System.out.printf("Сумма %s \n", sum);

        int avg = sum / (endNumber - startNumber);
        System.out.printf("Среднее арифметическое %s", avg);
    }
}
