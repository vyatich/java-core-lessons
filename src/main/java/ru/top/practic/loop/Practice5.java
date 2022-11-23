package ru.top.practic.loop;

import java.util.Scanner;

public class Practice5 {

    //Задание 4
    //Пользователь вводит с клавиатуры число. Требуется
    //посчитать факториал числа. Например, если введено 3,
    //факториал числа 1*2*3 = 6.
    //Формула для расчета факториала: n! = 1*2*3…*n, где
    //n — число для расчета факториала
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (number < 1) {
            System.out.println("Введено некорректное значение, введите снова");
            number = scanner.nextInt();
        }

        int fact = 1;
        for (int currentNumber = 1; currentNumber <= number; currentNumber++) {
            fact *= currentNumber;
        }
        System.out.println(fact);
    }
}
