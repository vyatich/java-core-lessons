package ru.top.practic.loop;

import java.util.Scanner;

public class Practice10 {

    //Пользователь вводит с клавиатуры размер стороны
    //квадрата. Требуется отобразить на экран незаполненный
    //квадрат (отображаются только границы квадрата). Размер
    //стороны равен введённому размеру.
    //****
    //*  *
    //*  *
    //****
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        for (int line = 0; line < length; line++) {
            for (int column = 0; column < length; column++) {
                boolean firstOrLastLine = line == 0 || line == length - 1;
                boolean firstOrLastColumn = column == 0 || column == length - 1;
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
