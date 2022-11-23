package ru.top.practic.method;

public class Practice8 {

    //Задание 3
    //Напишите метод, определяющий количество чётных,
    //нечётных, положительных, отрицательных элементов
    //массива. Массив передаётся в качестве параметра.
    public static void main(String[] args) {
        int[] numbers = {-1, 2, 0, -5, 12, 7};
        printArrayInfo(numbers);
    }

    private static void printArrayInfo(int[] numbers) {
        int evenNumberCount = 0;
        int positiveNumberCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumberCount++;
            }
            if (number >= 0) {
                positiveNumberCount++;
            }
        }

        System.out.printf("чётных - %s, нечётных - %s, положительных - %s, отрицательных - %s",
                evenNumberCount, numbers.length - evenNumberCount,
                positiveNumberCount, numbers.length - positiveNumberCount);
    }
}
