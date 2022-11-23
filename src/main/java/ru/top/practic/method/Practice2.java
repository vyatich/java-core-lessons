package ru.top.practic.method;

public class Practice2 {

    //\Задание 2
    //Напишите метод, который принимает два числа в качестве параметра и отображает все четные числа между ним
    public static void main(String[] args) {
        printEvenNumbers(2, 6);
    }

    private static void printEvenNumbers(Integer start, Integer end) {
        Integer realStart = start;//10
        Integer realEnd = end;//4

        if (start > end) {
            realStart = end;//4
            realEnd = start;//10
        }

        for (int currentNumber = realStart; currentNumber <= realEnd; currentNumber++) {
            if (currentNumber % 2 == 0) {
                System.out.println(currentNumber);
            }
        }
    }
}
