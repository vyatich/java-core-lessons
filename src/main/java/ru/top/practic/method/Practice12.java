package ru.top.practic.method;

import java.util.Arrays;

public class Practice12 {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 10, 5};
        System.out.println(Arrays.toString(getFactorialArray(numbers)));
    }

    public static int[] getFactorialArray(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = getFactorial(numbers[i]);
        }
        return result;
    }

    public static int getFactorial(int number) {
        if (number <= 0) {
            throw new RuntimeException(String.format("Факториал %s не существует", number));
        }
        if (number == 1 || number == 2) {
            return number;
        } else {
            return getFactorial(number - 1) * number;
        }
    }
}
