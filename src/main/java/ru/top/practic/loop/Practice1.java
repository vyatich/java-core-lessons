package ru.top.practic.loop;

import java.util.Scanner;

public class Practice1 {

    //Задание 1
    //Пользователь вводит с клавиатуры два числа. Нужно
    //показать все числа в указанном диапазоне.
    //array -> array[1];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = scanner.nextInt();
        int endNumber = scanner.nextInt();

        for (int currentNumber = startNumber; currentNumber <= endNumber; currentNumber++) {
            System.out.println(currentNumber);
        }
    }
}
