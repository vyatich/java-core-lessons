package ru.top.core;

public class Operation {

    // + - * / % ++ --
    // 101 << 1 = 1010 = 0 * 2^0 + 1 * 2^1 + 0 * 2^2 + 1 * 2^3 = 0 + 2 + 0 + 8 = 10
    // 101 >> 1 = 10 = 0 * 2^0 + 1 * 2^1 = 0 + 2 = 2
    // 101 >> 2 = 1 = 1 * 2^0 = 1
    // true & true = true
    // false | false = false
    // false & true =
    // false && true =
    // x = a > b ? 1 : 0;
    public static void main(String[] args) {
        byte age = 41;

        if (age > 40) {

        } else if (age > 41) {

        }

        switch (age) {
            case 40:
                System.out.println("Возраст 40");
                break;
            case 41:
                System.out.println("Возраст 41");
                break;
            case 42:
                System.out.println("Возраст 42");
                break;
            default:
                System.out.println("Возраст слишком маленький");
        }
    }
}
