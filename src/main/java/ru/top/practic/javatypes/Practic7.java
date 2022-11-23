package ru.top.practic.javatypes;

import java.util.Scanner;

public class Practic7 {

    //Задание 4
    //Пользователь вводит с клавиатуры два числа. Первое
    //число — это значение, второе число процент, который
    //необходимо посчитать. Например, мы ввели с клавиатуры
    //50 и 10. Требуется вывести на экран 10 процентов от 50.
    //Результат: 5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float number = scanner.nextFloat();
        float percent = scanner.nextFloat();

        System.out.println(Math.ceil(0.2));

        float percentOfNumber = (number / 100 ) * percent;

        System.out.println(percentOfNumber);
    }
}
