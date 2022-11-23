package ru.top.practic.string;

import java.util.Scanner;

public class Practice2 {

    //    Задание 2
    //Пользователь вводит с клавиатуры строку и слово
    //для поиска. Посчитайте сколько раз в строке встречается
    //искомое слово. Полученное число выведите на экран.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String word = scanner.nextLine();

        String[] splitString = str.split("\s");

        int count = 0;
        for (String currentWord : splitString) {
            if (currentWord.equals(word)) {
                count++;
            }
        }

        System.out.printf("Количество вхождений %s", count);
    }
}
