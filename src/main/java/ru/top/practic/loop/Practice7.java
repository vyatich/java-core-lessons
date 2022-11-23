package ru.top.practic.loop;

import java.util.Scanner;

public class Practice7 {

    //    Задание 6
    //Пользователь вводит с клавиатуры длину линии и символ для заполнения линии. Нужно отобразить на экране
    //вертикальную линию из введенного символа, указанной
    //длины.
    //Например, если было введено 5 и символ %, тогда
    //вывод на экран будет такой:
    //%
    //%
    //%
    //%
    //%
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.valueOf(scanner.nextLine());
        String symbol = scanner.nextLine();

        for (int i = 0; i < length; i++) {
            System.out.println(symbol);
        }
    }
}
