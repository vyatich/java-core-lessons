package ru.top.practic.concurrent.practice3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    //Задание 3
    //Пользователь с клавиатуры вводит путь к файлу,
    //содержащему набор чисел. После чего запускаются две
    //потока. Первый поток создает новый файл, в который
    //запишет только четные элементы массива. Второй поток
    //создает новый файл в который запишет только нечетные
    //элементы массива. Количество четных и нечетных элементов возвращается в метод main.

    public static List<Integer> numbers;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String nameFile = scanner.nextLine();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(nameFile));
        String line = bufferedReader.readLine();
        String[] arrayList = line.split(" ");
        numbers = Arrays.stream(arrayList).map(Integer::valueOf)
                .collect(Collectors.toList());


        FileThread evanTask = new FileThread(n -> n % 2 == 0);
        Thread evenThread = new Thread(evanTask);
        evenThread.start();

        FileThread noEvanTask = new FileThread(n -> n % 2 != 0);
        Thread noEvaenThread = new Thread(noEvanTask);
        noEvaenThread.start();

    }
}
