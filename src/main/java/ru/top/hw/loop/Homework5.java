package ru.top.hw.loop;

import java.util.Scanner;

public class Homework5 {

    //Задание 5
    //Напишите программу, которая будет проверять, является
    //ли число, введенное с клавиатуры палиндромом (одинаково
    //читающееся в обоих направлениях). Например, 123454321
    //или 221122 – палиндром. Программа должна вывести YES,
    //если число является палиндромом, и NO – в противоположном случае.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int copyOfNumber = number; //221122
        String resultString = ""; //""

        while (copyOfNumber != 0) { //2
            resultString = resultString + (copyOfNumber % 10); //2 % 10 = 2 ; palindromString = "221122"
            copyOfNumber = copyOfNumber / 10; //2 / 10 = 0
        }

        int resultInt = Integer.parseInt(resultString);
        if (number == resultInt) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
