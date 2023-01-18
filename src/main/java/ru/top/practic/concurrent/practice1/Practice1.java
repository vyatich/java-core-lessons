package ru.top.practic.concurrent.practice1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//ользователь с клавиатуры вводит значения в массив. После чего запускаются две потока. Первый поток
//находит максимум в массиве. Второй поток находит минимум в массиве. Результаты вычислений возвращаются
//в метод main.
public class Practice1 {

    public static List<Integer> numbers;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Введите числа через пробел");
        Scanner scanner = new Scanner(System.in);
        String numbersLine = scanner.nextLine();
        String[] numberString = numbersLine.split(" ");
        numbers = Arrays.stream(numberString)
                .map(Integer::valueOf)
                .toList();

        Comparator<Integer> findMax = (a, b) -> a - b;
        ThreadCalculate threadCalculateMax = new ThreadCalculate(findMax);
        threadCalculateMax.start();
        threadCalculateMax.join();
        int max = threadCalculateMax.getResult();
        System.out.println(max);

        Comparator<Integer> findMin = (a, b) -> b - a;
        ThreadCalculate threadCalculateMin = new ThreadCalculate(findMin);
        threadCalculateMin.start();
        threadCalculateMin.join();
        int min = threadCalculateMin.getResult();
        System.out.println(min);
    }

}
