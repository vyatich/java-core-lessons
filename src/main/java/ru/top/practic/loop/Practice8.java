package ru.top.practic.loop;

import java.util.Scanner;

public class Practice8 {

    //Задание 7
    //Пользователь вводит с клавиатуры два числа (начало и
    //конец диапазона). Требуется проанализировать все числа
    //в этом диапазоне. Вывод на экран должен проходить по
    //правилам, указанным ниже.
    //Если число кратно 3 (делится на 3 без остатка) нужно
    //вывести слово «Fizz». Если число кратно 5 нужно вывести
    //слово «Buzz». Если число кратно 3 и 5 нужно вывести
    //«Fizz Buzz». Если число не кратно не 3 и 5 нужно вывести
    //само число.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for (int current = start; current <= end; current++) {
            if (current % 3 == 0 && current % 5 == 0) {
                System.out.println("Fizz Buzz");
                continue;
            } else if (current % 3 != 0 && current % 5 != 0) {
                System.out.println(current);
            }
            if (current % 3 == 0) {
                System.out.println("Fizz");
            }
            if (current % 5 == 0) {
                System.out.println("Buzz");
            }
        }
    }
}
