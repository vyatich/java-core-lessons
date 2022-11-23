package ru.top.practic.array;

import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {

    //Задание 6
    //Пользователь с клавиатуры вводит элементы одномерного массива. Необходимо найти сумму элементов
    //массива, среднеарифметическое, отобразить на экран все
    //элементы массива.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину массива");
        int length = scanner.nextInt();

        int[] array = new int[length];//9,2,4  2,4,9 - > false

        for (int index = 0; index < array.length; index++) {
            System.out.printf("Введите значение %s элемента массива\n", index);
            array[index] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));

        int sum = 0;
        for (int curenNumber : array) {
            sum += curenNumber;
        }
        System.out.println(sum);
        System.out.println(sum / array.length);
    }
}
