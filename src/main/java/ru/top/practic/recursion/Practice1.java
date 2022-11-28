package ru.top.practic.recursion;

import java.util.Scanner;

public class Practice1 {

    static StringBuilder stringBuilder = new StringBuilder();

//    Задание 1
//    Даны два целых числа A и В. Выведите все числа от A до
//    B включительно, в порядке возрастания, если A < B, или в
//    порядке убывания – в противном случае.
//            Ввод: 5 1
//    Вывод: 5 4 3 2 1
    public static void main(String[] args) {
        outputAscendingOrDescending(5, 1);
        System.out.println();
        outputAscendingOrDescending(9, 4);
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        if (start < end) {
            printNumberAscByRange(start, end);
        } else {
            printNumberDescByRange(start, end);
        }
    }

    public static void printNumberAscByRange(int start, int end) { //10, 10
        if (start == end) { //false 10 == 10
            System.out.println(end); //10
        } else {
            System.out.println(start); //5 6 7 8 9
            printNumberAscByRange(++start, end);
        }
    }

    public static void printNumberDescByRange(int start, int end) {
        if (start == end) {
            System.out.println(end);
        } else {
            System.out.println(start);
            printNumberDescByRange(--start, end);
        }
    }

    private static void outputAscendingOrDescending(int a, int b) {
        if (a <= b) {
            System.out.printf("%s ", a);
            if (a == b) {
                return;
            }
            outputAscendingOrDescending(a + 1, b);
        } else if (a > b) {
            System.out.printf("%s ", a);
            outputAscendingOrDescending(a - 1, b);
        }
    }
}
