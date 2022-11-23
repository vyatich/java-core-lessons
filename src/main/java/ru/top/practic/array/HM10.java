package ru.top.practic.array;

import java.util.Scanner;

public class HM10 {

    //Задание 10
    //Заполнить массив размерности n случайными цифрами от 0 до 33. Найти элемент массива, который делится
    //без остатка на значение элемента слева и значение элемента справа. Вывести на консоль значения исходного массива.
    //Вывести индекс найденного элемента, если такой не найден,
    //вывести -1. n – задается с клавиатуры.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            array[currentIndex] = (int) (Math.random() * 34);
        }

        for (int index = 1; index < array.length - 1; index++) {
            if (array[index - 1] == 0 || array[index + 1] == 0) {
                continue;
            }
            if (array[index] % array[index - 1] == 0 && array[index] % array[index + 1] == 0) {
                System.out.printf("%d\n", index);
                System.out.printf("%d %d %d\n", array[index - 1], array[index], array[index + 1]);
                return;
            }
        }
        System.out.println(-1);
    }
}
