package ru.top.practic.operator;

import java.util.Scanner;

public class Practic4 {

    //    Пользователь с клавиатуры вводит количество часов.
//    Если полученное значение находится в диапазоне от 0 до
//6 нужно вывести надпись «Good Night», если в диапазоне
//    от 6 до 13 «Good Morning», если в диапазоне от 13 до 17
//            «Good Day», если в диапазоне от 17 до 0 «Good Evening».
//    Верхняя граница диапазона не включается. Например,
//    число 6 относится к 6 до 13
    //CTRL + ALT + L
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourCount = scanner.nextInt();

        if (hourCount >= 0 && hourCount < 6) {
            System.out.println("Good Night");
        } else if (hourCount >= 6 && hourCount < 13) {
            System.out.println("Good Morning");
        } else if (hourCount >= 13 && hourCount < 17) {
            System.out.println("Good Day");
        } else if (hourCount >= 17 && hourCount <= 24) {
            System.out.println("Good Evening");
        }
    }
}
