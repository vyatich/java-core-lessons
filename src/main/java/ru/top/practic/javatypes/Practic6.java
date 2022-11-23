package ru.top.practic.javatypes;

import java.util.Scanner;

public class Practic6 {

    //Задание 3
    //Пользователь вводит с клавиатуры два числа. Необходимо найти сумму чисел, разницу чисел, произведение
    //чисел. Результат вычислений вывести на экран.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int diff = firstNumber - secondNumber;
        int mux = firstNumber * secondNumber;

        System.out.printf("Сумма равна %s \n", sum);
        System.out.printf("Разница равна %s \n", diff);
        System.out.printf("Произведение равно %s \n", mux);
    }
}
