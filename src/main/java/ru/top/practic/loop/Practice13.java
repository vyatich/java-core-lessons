package ru.top.practic.loop;

import java.util.Scanner;

public class Practice13 {

    //Задание 5
    //Показать на экран таблицу умножения в диапазоне,
    //указанном пользователем. Например, если пользователь
    //указал 3 и 5, таблица может выглядеть так:
    //3*1 = 3 3*2 = 6 3*3 = 9 .... 3* 10 = 30
    //.......................................
    //5*1 = 5 5 *2 = 10 5 *3 = 15 ...........
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for (int currentNumber = start; currentNumber <= end; currentNumber++) {
            for (int multiplier = 1; multiplier <= 10; multiplier++) {
                System.out.printf("%s*%s = %s; ", currentNumber, multiplier, currentNumber * multiplier);
            }
            System.out.print("\n");
        }
    }
}
