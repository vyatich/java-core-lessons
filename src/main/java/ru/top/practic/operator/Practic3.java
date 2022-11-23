package ru.top.practic.operator;

import java.util.Scanner;

public class Practic3 {

    //Пользователь вводит с клавиатуры три числа. В зависимости от выбора пользователя программа выводит
    //на экран максимум из трёх, минимум из трёх или среднеарифметическое трёх чисел
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        System.out.println("Введите \n 0 - получение максимума \n 1 - минимума \n 2 - среднего арифметического");
        int operationNumber = scanner.nextInt();

        switch (operationNumber) {
            case 0:
                System.out.println(Math.max(Math.max(firstNumber, secondNumber), thirdNumber));
                break;
            case 1:
                System.out.println(Math.min(Math.min(firstNumber, secondNumber), thirdNumber));
                break;
            case 2:
                int average = (firstNumber + secondNumber + thirdNumber) / 3;
                System.out.println(average);
                break;
            default:
                System.out.println("Выбран неверный тип операции");
        }
    }
}
