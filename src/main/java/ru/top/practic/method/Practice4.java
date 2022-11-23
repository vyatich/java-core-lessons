package ru.top.practic.method;

public class Practice4 {

    //    Задание 4
    //Напишите метод, который возвращает максимальное
    //из четырёх чисел. Числа передаются в качестве параметров.
    public static void main(String[] args) {
        System.out.println(getMax());
    }

    public static int getMax(int... numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
