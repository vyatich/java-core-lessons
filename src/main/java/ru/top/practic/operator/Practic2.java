package ru.top.practic.operator;

import java.util.Scanner;

public class Practic2 {

    //Пользователь вводит с клавиатуры три числа. В зависимости от выбора пользователя программа выводит
    //на экран сумму трёх чисел или произведение трёх чисел.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        System.out.println("Введите 0, если хотите получить сумму или 1 если произведение");
        int operationNumber = scanner.nextInt();

        switch (operationNumber) {
            case 0:
                System.out.println(firstNumber + secondNumber + thirdNumber);
                break;
            case 1:
                System.out.println(firstNumber * secondNumber * thirdNumber);
                break;
            default:
                System.out.println("Выбран неверный тип операции");
        }
    }
}
