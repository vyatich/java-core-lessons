package ru.top.practic.method;

import java.util.Arrays;

public class Practice11 {

    //Задание 6
    //Напишите метод, который ищет некоторое число
    //в массиве с помощью двоичного поиска.
    public static void main(String[] args) {
        int[] array = {10, 56, -1, 12, 8};
        Arrays.sort(array);
        System.out.println(indexOf(array, 8));
    }

    private static int indexOf(int[] array, int number) {
        return Arrays.binarySearch(array, number);
    }
}
