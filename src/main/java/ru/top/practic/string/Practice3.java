package ru.top.practic.string;

import java.util.Scanner;

public class Practice3 {

    //    Задание 3
    //Пользователь вводит с клавиатуры строку, слово для
    //поиска, слово для замены. Произведите в строке замену
    //одного слова на другое. Полученную строку отобразите
    //на экране.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String searchWord = scanner.nextLine();
        String replaceWord = scanner.nextLine();

        String[] splitString = str.split("\s");

        StringBuilder stringBuilder = new StringBuilder();//String result
        for (String currentWord : splitString) {
            if (currentWord.equals(searchWord)) {
                stringBuilder.append(replaceWord).append("\s");//result += replaceWord
            } else {
                stringBuilder.append(currentWord).append("\s");//result += currentWord
            }
        }

        System.out.println(stringBuilder);
    }
}
