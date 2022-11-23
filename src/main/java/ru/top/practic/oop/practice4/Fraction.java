package ru.top.practic.oop.practice4;

public class Fraction {

    private final Double numerator;
    private final Double denominator;

    public Fraction(Double numerator, Double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //    Также создайте
////методы класса для выполнения арифметических операций
////(сложение, вычитание, умножение, деление, и т.д.).

    public Double getSum() {
        return numerator + denominator;
    }

    public Double getDiff() {
        return numerator - denominator;
    }

    public Double getMux() {
        return numerator * denominator;
    }

    public Double getMul() {
        if (denominator == 0) {
            System.out.println("Denominator is 0");
            return null;
        }
        return numerator / denominator;
    }

    public Double getNumerator() {
        return numerator;
    }

    public Double getDenominator() {
        return denominator;
    }
}
