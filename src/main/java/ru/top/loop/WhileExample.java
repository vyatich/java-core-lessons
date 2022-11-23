package ru.top.loop;

public class WhileExample {
    static final int MAX_AGE = 100;

    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            System.out.println(MAX_AGE / i);
            System.out.println("Привет мир!");
        }
    }
}
