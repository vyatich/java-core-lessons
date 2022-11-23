package ru.top.practic.javatypes;

import java.util.Scanner;

public class Practic5 {

    //Задание 5
    //Пользователь с клавиатуры вводит четырёхзначное
    //число. Необходимо перевернуть число и отобразить
    //результат. Например, если введено 4512, результат 2154
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int number = scanner.nextInt();

        int firstDigit = number % 10;
        int secondDigit = (number / 10) % 10;
        int thirdDigit = (number / 100) % 10;
        int fourthDigit = (number / 1000) % 10;

        System.out.printf("%d%d%d%d", firstDigit, secondDigit, thirdDigit, fourthDigit);
    }
}
