package ru.top.practic.concurrent.practice2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

//    Задание 2
//Пользователь с клавиатуры вводит значения в массив.
//После чего запускаются две потока. Первый поток находит сумму элементов в массиве. Второй поток находит
//среднеарифметическое в массиве. Результаты вычислений
//возвращаются в метод main

    public static List<Integer> numbers;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numberString = line.split(" ");
        numbers = Arrays.stream(numberString)
                .map(Integer::valueOf)
                .toList();

        CalculateTask sumTask = new CalculateTask(numbers -> numbers.stream().mapToInt(n -> n).sum());
        Thread sumThread = new Thread(sumTask);
        sumThread.start();
        sumThread.join();

        Integer sum = sumTask.getResult().intValue();
        System.out.println(sum);

        CalculateTask avgTask = new CalculateTask(numbers -> numbers.stream().mapToInt(n -> n).average().getAsDouble());
        Thread avgThread = new Thread(avgTask);
        avgThread.start();
        avgThread.join();
        Double avg = avgTask.getResult().doubleValue();
        System.out.println(avg);
    }
}
