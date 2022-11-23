package ru.top.practic.oop.practice4;

public class Practice4 {
    //    Задание 4
//Создайте класс Дробь. Необходимо хранить в полях
//класса: числитель и знаменатель. Реализуйте методы класса для ввода данных, вывода данных, реализуйте доступ
//к отдельным полям через методы класса. Также создайте
//методы класса для выполнения арифметических операций
//(сложение, вычитание, умножение, деление, и т.д.).
    public static void main(String[] args) {
        Fraction fraction = new Fraction(1.0D, 0.0D);
        System.out.println(fraction.getSum());
        System.out.println(fraction.getMul());
    }
}
