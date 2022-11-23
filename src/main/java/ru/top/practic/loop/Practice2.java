package ru.top.practic.loop;

import java.util.Scanner;

public class Practice2 {

    //Задание 2
    //Пользователь вводит с клавиатуры два числа. Нужно
    //показать все четные числа в указанном диапазоне.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = scanner.nextInt();
        int endNumber = scanner.nextInt();

        for (int currentNumber = startNumber; currentNumber < endNumber; currentNumber++) {
             if (currentNumber % 2 == 0) {
                 System.out.println(currentNumber);
             }
        }
    }
}
