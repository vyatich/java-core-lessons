package ru.top.practic.oop.interfaces.practice2;

import ru.top.practic.oop.interfaces.practice1.Array;

public class Main {

//    Создайте интерфейс IMath. В нём должно быть три
//метода:
//■ int Max() — возвращает максимум;
//■ int Min() — возвращает минимум;
//■ float Avg() — возвращает среднеарифметическое.
//Класс, созданный в первом задании Array, должен
//имплементировать интерфейс IMath.
//Метод Max — возвращает максимум среди элементов
//массива.
//Метод Min — возвращает минимум среди элементов
//массива.
//Метод Avg — возвращает среднеарифметическое
//среди элементов массива.
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{5, 6, 4, 2};
        Array array = new Array(integers);
        System.out.println(array.max());
        System.out.println(array.min());
        System.out.println(array.avg());
    }
}
