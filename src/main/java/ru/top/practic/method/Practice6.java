package ru.top.practic.method;

public class Practice6 {

    //    Задание 6
    //Напишите метод, который проверяет является ли число
    //простым. Число передаётся в качестве параметра. Если
    //число простое нужно вернуть из метода true, иначе false
    public static void main(String[] args) {
        System.out.println(isSimpleNumber(97));
    }

    private static boolean isSimpleNumber(int number) {
        for (int delimiter = 2; delimiter < number / 2; delimiter++) {
            if (number % delimiter == 0) {
                return false;
            }
        }
        return true;
    }
}
