package ru.top;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Задание 1
        //Заполнить массив на 15 элементов числами Фибоначчи.
        //Вывести на консоль только четные элементы массива.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество жизней дракона: ");
        int healthDragon = scanner.nextInt();
        System.out.println("Введите силу атаки Дракона: ");
        int damageDragon = scanner.nextInt();
        System.out.println("Введите количество жизней воинов: ");
        int healthOfWarriors = scanner.nextInt();
        System.out.println("Введите силу атаки воинов: ");
        int damageOfWarriors = scanner.nextInt();
        int warriorCount = damageDragon / healthOfWarriors;
        int attackPower = (damageOfWarriors * warriorCount);
        System.out.println("Воинов: " + warriorCount);
        while (healthDragon >= 0) {
            if (attackPower > 0) {
                System.out.println("Воины атакуют урон: " + attackPower + " - у дракона осталось " + (healthDragon - attackPower) + " Жизни");
                healthDragon = healthDragon - attackPower;
                attackPower = attackPower - damageDragon;
                int warriorsCountSum = attackPower / healthOfWarriors;
                System.out.println("Дракон атакует урон: " + damageDragon + " - осталось " + (warriorsCountSum) + " воинов");
                if ((healthDragon - attackPower) <= 0) {
                    System.out.println("Воины атаковали, дракон побеждён!");
                    break;
                } else if (warriorsCountSum <= 0) {
                    System.out.println("Дракон победил " + warriorCount + " воинов, добавим еще одного и попробуем снова.");
                    break;
                }
            }
        }
    }

    public static String recursion(int a, int b) {
        if (a > b) {
            return a + " " + recursion(a - 1, b);
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion(a + 1, b);
        }
    }
}