package ru.top.practic.method;

import java.util.Arrays;
import java.util.Comparator;

public class Practice9 {

    //    Задание 4
    //Напишите метод, сортирующий массив по убыванию или возрастанию в зависимости от выбора
    //пользователя.
    public static void main(String[] args) {
        Integer[] numbers = {0, -5, 9, 6, 10};
        sort(numbers, false);
        System.out.println(Arrays.toString(numbers));
    }

    private static void sort(Integer[] array, boolean isAsc) {
        if (isAsc) {
            Arrays.sort(array);
        } else {
            Arrays.sort(array, Comparator.reverseOrder());
        }
    }
}
