package ru.top.practic.string;

import java.util.Scanner;

public class HW1 {

    //Ввести с клавиатуры строку текста, а затем один символ.
    //Показать на консоль индексы и количество совпадений (ищем
    //вхождения символа в строку). В случае если совпадений не
    //найдено, вывести соответствующий текст.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку");
        String line = scanner.nextLine();
        System.out.println("Введите искомый символ");
        String symbol = scanner.nextLine();
        char character = symbol.charAt(0);

        char[] chars = line.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == character) {
                System.out.println(i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Совпадений не найдено");
        } else {
            System.out.printf("Количество совпадений - %s", count);
        }
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите тескт ");
//        String text = scanner.nextLine();
//        System.out.print("Введите символ ");
//        String simbol = scanner.next();
//        int index = text.indexOf(simbol);
//        int count = 0;
//        if (index == -1) {
//            System.out.println("Символов не найдено!");
//            return;
//        }
//        while (index >= 0) {
//            count++;
//            System.out.println(index);
//            index = text.indexOf(simbol, index + 1);
//        }
//        System.out.printf("Количество совпадений: %x", count);

    }
}
