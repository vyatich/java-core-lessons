package ru.top.practic.array;

import java.util.Scanner;

public class Practice2 {

    //    Задание 7
    //Пользователь с клавиатуры вводит элементы одномерного массива и некоторое число. Необходимо посчитать
    //сколько раз данное число присутствует в массиве
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину массива");
        int length = scanner.nextInt();

        int[] array = new int[length];

        for (int index = 0; index < array.length; index++) {
            System.out.printf("Введите значение %s элемента массива\n", index);
            array[index] = scanner.nextInt();
        }

        System.out.println("Введите искомое число");
        int searchNumber = scanner.nextInt();

        int countOfSearch = 0;
        for (int currentNumber : array) {
            if (currentNumber == searchNumber) {
                countOfSearch++;
            }
        }
        System.out.println(countOfSearch);
    }
}
