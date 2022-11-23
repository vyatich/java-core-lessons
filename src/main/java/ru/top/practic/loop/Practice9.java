package ru.top.practic.loop;

import java.util.Scanner;

public class Practice9 {

    //Задание 1
    //Пользователь вводит с клавиатуры размер стороны
    //квадрата. Требуется отобразить на экран заполненный
    //квадрат. Размер стороны равен введённому размеру. Например, если пользователь ввёл 3 на экране будет выведено:
    //***
    //***
    //***
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
