package ru.top.practic.string;

import java.util.Scanner;

public class HW10 {

//    Задание 10
//Напишите программу, которая будет печатать
//ромбовидный рисунок на основе строки, введенной с
//клавиатуры (максимальная длина – 50 символов).
//Пример вывода для строки testing:
//        t
//        te
//       tes
//      test
//      testi
//      testin
//     testing
//      esting
//      sting
//      ting
//      ing
//      ng
//      g
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int lineLength = line.length();

        for (int i = 1; i <= lineLength; i++) {
            String substring = line.substring(0, i);
            int whitespaceCount = (lineLength - i) / 2 + 1;
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < whitespaceCount; j++) {
                stringBuilder.append("\s");
            }
            stringBuilder.append(substring);
            System.out.println(stringBuilder);
        }

        for (int i = 1; i < lineLength; i++) {
            String substring = line.substring(i, lineLength);
            int whitespaceCount = i / 2 + 1;
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < whitespaceCount; j++) {
                stringBuilder.append("\s");
            }
            stringBuilder.append(substring);
            System.out.println(stringBuilder);
        }
    }
}
