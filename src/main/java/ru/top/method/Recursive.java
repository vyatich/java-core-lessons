package ru.top.method;

import java.util.List;

public class Recursive {

    private final DigitFileReader digitFileReader;

    public Recursive(DigitFileReader digitFileReader) {
        this.digitFileReader = digitFileReader;
    }

    public List<Integer> getFactorialByFile() {
        List<Integer> digits = digitFileReader.getDigits();
        return digits.stream()
                .map(this::getFactorial)
                .toList();
    }

    public int getFactorial(int number) {
        if (number <= 0) {
            throw new RuntimeException(String.format("Факториал %s не существует", number));
        }
        if (number == 1 || number == 2) {
            return number;
        } else {
            return getFactorial(number - 1) * number;
        }
    }
}
