package ru.top.practic.method;

import java.util.Arrays;

public class Practice10 {

    //Напишите метод, переворачивающий содержимое
    //массива.
    public static void main(String[] args) {
        int[] array = {1, 9, 5, 8};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    private static void reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[array.length - i - 1] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = reversedArray[i];
        }
    }
}
