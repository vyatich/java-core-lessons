package ru.top.practic.method;

public class Practice7 {

    //    Задание 7
    //Напишите метод, который проверяет является ли
    //шестизначное число «счастливым». Число передаётся
    //в качестве параметра. Если число счастливое нужно вернуть из метода true, иначе false.
    //«Счастливое шестизначное число» — это число у которого сумма первых трёх цифр равна сумме трёх вторых
    //цифр. Например, 123420 — счастливое 1+2+3 = 4+2+0,
    //а 723422 — несчастливое 7+2+3 != 4+2+2.
    public static void main(String[] args) {
        System.out.println(isLuckyNumber(723422));
    }

    public static boolean isLuckyNumber(int number) {
        int firstPart = number / 1000;
        int secondPart = number % 1000;

        int sumFirstPart = getSumDigits(firstPart);
        int sumSecondPart = getSumDigits(secondPart);

        return sumFirstPart == sumSecondPart;
    }

    private static int getSumDigits(int partOfNumber) {
        return partOfNumber / 100 + (partOfNumber / 10) % 10 + partOfNumber % 10;
    }
}
