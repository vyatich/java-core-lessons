package ru.top.method;

public class Recursive {

    public static void main(String[] args) {
        System.out.println(getFactorial(5));//1*2*3*4*5 = 120
    }

    public static int getFactorial(int number) {
        if (number == 1 || number == 2) {
            return number;
        } else {
            return getFactorial(number - 1) * number;
        }
    }
}
