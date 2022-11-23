package ru.top.practic.oop;

import java.util.Scanner;

public class Incapsulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineNumberPairs = scanner.nextLine();
        System.out.println(lineNumberPairs);
        String[] split = lineNumberPairs.split(",");
        for (String s : split) {
            System.out.println(s);
        }
    }
}
