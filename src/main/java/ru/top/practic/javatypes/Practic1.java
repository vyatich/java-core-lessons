package ru.top.practic.javatypes;

import java.util.Scanner;

public class Practic1 {

    //Задание 1
    //Пользователь вводит с клавиатуры три цифры. Необходимо создать число, содержащее эти цифры. Например,
    //если с клавиатуры введено 7, 3, 8, тогда нужно сформировать число 738.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 цифры");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int result = first * 100 + second * 10 + third;
        System.out.printf("%d%d%d", first, second, third);
    }
}
