package ru.top.practic.loop;

import java.util.Scanner;

public class Practice11 {

    //Задание 3
    //Пользователь вводит с клавиатуры длину и ширину
    //прямоугольника. Требуется отобразить на экран незаполненный прямоугольник
    // (отображаются только границы прямоугольника). Размер длины и ширины равен
    //введенным данным
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();

        for (int line = 0; line < length; line++) {
            for (int column = 0; column < width; column++) {
                boolean firstOrLastLine = line == 0 || line == length - 1;
                boolean firstOrLastColumn = column == 0 || column == width - 1;
                if (firstOrLastLine || firstOrLastColumn) {
                    System.out.print("*");
                } else {
                    System.out.print("\s");
                }
            }
            System.out.println();
        }
    }
}
