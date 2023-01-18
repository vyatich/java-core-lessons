package ru.top.practic.concurrent;

import java.util.Comparator;

public class ThreadCalculate extends Thread {

    private int result;
    private final Comparator<Integer> integerComparator;

    public ThreadCalculate(Comparator<Integer> integerComparator) {
        this.integerComparator = integerComparator;
    }

    public int getResult() {
        return result;
    }

    @Override
    public void run() {
        result = Practice1.numbers.stream()
                .max(integerComparator)
                .orElse(0);
    }
}
