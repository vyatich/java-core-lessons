package ru.top.practic.loop;

import java.util.Scanner;

public class Practice12 {

    //Задание 4
    //Показать на экран все простые числа в диапазоне,
    //указанном пользователем. Число называется простым,
    //если оно делится без остатка только на себя и на единицу.
    //Например, три — это простое число, а четыре нет
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        long startTime = System.currentTimeMillis();

        for (int currentNumber = start; currentNumber <= end; currentNumber++) {
            boolean isSimpleNumber = true;
            for (int delimeter = 2; delimeter < currentNumber / 2; delimeter++) {
                if (currentNumber % delimeter == 0) {
                    isSimpleNumber = false;
                    break;
                }
            }

            if (isSimpleNumber) {
                System.out.printf("Простое число %s\n", currentNumber);
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.printf("Time is %s", endTime - startTime);
    }
}
