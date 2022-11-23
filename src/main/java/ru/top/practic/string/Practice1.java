package ru.top.practic.string;

import java.util.Scanner;

public class Practice1 {

    //    адание 1
    //Пользователь вводит с клавиатуры строку. Произведите поворот строк и полученный результат выведите
    //на экран.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
        System.out.println(stringBuilder.reverse());
    }
}
