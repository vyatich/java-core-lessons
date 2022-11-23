package ru.top.practic.javatypes;

import java.util.Scanner;

public class Practic2 {

    //Задание 2
    //Пользователь вводит с клавиатуры число, состоящее
    //из четырех цифр. Требуется найти произведение цифр.
    //Например, если с клавиатуры введено 1324, тогда результат произведения 1*3*2*4 = 24
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, состоящее из 4 цифр");
        int number = scanner.nextInt();
        int firstPart = number / 1000;
        int secondPart = (number % 1000) / 100;
        int thirdPart = (number % 100) / 10;
        int lastPart = number % 10;
        int result = firstPart * secondPart * thirdPart * lastPart;
        System.out.println(result);
    }
}
