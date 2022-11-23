package ru.top.practic.string;

import java.util.Scanner;

public class Practice4 {

    //    Задание 4
    //Пользователь вводит с клавиатуры строку. Проверьте
    //является ли введенная строка палиндромом. Палиндром — слово или текст, которое читается одинаково
    //слева направо и справа налево. Например, кок; А роза упала на лапу Азора; доход; А буду я у дуба.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String strWithoutWhitespaces = str.replace("\s", "");//Абудуяудуба

        StringBuilder stringBuilder = new StringBuilder(strWithoutWhitespaces);
        stringBuilder.reverse();//StringBuilder(aбудуяудубA)
        String reversedStr = stringBuilder.toString();//aбудуяудубA

        System.out.println(reversedStr.equalsIgnoreCase(strWithoutWhitespaces));//aбудуяудубA == Абудуяудуба
    }
}
