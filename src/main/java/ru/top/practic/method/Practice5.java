package ru.top.practic.method;

public class Practice5 {

    //Задание 5
    //Напишите метод, который возвращает сумму чисел
    //в указанном диапазоне. Границы диапазона передаются
    //в качестве параметров.
    public static void main(String[] args) {
        System.out.println(getSum(1, 5));
    }

    public static int getSum(int start, int end) {
        int sum = 0;
        for (int current = start; current <= end; current++) {
            sum += current;
        }
        return sum;
    }
}
