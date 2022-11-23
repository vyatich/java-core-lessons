package ru.top.practic.javatypes;

import java.util.Scanner;

public class Practic3 {

    //Задание 3
    //Пользователь вводит с клавиатуры количество метров. Требуется вывести результат перевода метров в
    //сантиметры, дециметры, миллиметры
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество метров");
        int meters = scanner.nextInt();
        System.out.printf("Сантиметров %d, дециметров %d, миллиметров %d", meters * 100, meters * 10, meters * 1000);
    }
}
