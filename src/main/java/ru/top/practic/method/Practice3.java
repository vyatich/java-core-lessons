package ru.top.practic.method;

public class Practice3 {

    //Задание 3
    //Напишите метод, который отображает горизонтальную или вертикальную линию из некоторого символа.
    //Метод принимает в качестве параметра: длину линии,
    //направление, символ.
    public static void main(String[] args) {
        printLine(5, false, 's');
    }

    private static void printLine(int length, boolean isVerticalLine, char lineCharacter) {
        for (int index = 0; index < length; index++) {
            if (isVerticalLine) {
                System.out.println(lineCharacter);
            } else {
                System.out.print(lineCharacter);
            }
        }
    }
}
