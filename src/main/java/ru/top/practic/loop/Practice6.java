package ru.top.practic.loop;

import java.util.Scanner;

public class Practice6 {

    //Задание 5
    //Пользователь вводит с клавиатуры длину линии.
    //Нужно отобразить на экране горизонтальную линию из *,
    //указанной длины.
    //Например, если было введено 7, тогда вывод на экран
    //будет такой:
    //*******
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
    }
}
